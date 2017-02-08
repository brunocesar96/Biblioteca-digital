package br.gov.mec.persistencia.framework.core;

import javolution.util.FastMap;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by brunocesar on 08/02/17.
 */
public  class QueryBuilder {
    protected StringBuilder jpqlBuffer = new StringBuilder();
    protected Map<String, Object> values = new FastMap<String, Object>();

    public QueryBuilder() {
    }

    public QueryBuilder(String jpqlFormat, Object... args) {
        appendJpql(jpqlFormat, args);
    }

    public QueryBuilder appendJpql(String jpqlFormat, Object... args) {
        if (args == null || args.length == 0) {
            jpqlBuffer.append(jpqlFormat);
        } else {
            jpqlBuffer.append(String.format(jpqlFormat, args));
        }
        return this;
    }

    public QueryBuilder addParameter(String paramName, Object value) {
        values.put(paramName, value);
        return this;
    }

    public QueryBuilder addAllParameters(Map<String, Object> parameters) {
        values.putAll(parameters);
        return this;
    }

    public Query toQuery(EntityManager em) {
        String jpql = extractJpql();
        Query query = em.createQuery(jpql);
        for (Entry<String, Object> entry : values.entrySet()) {
            if (entry.getValue() != null)
                query.setParameter(entry.getKey(), entry.getValue());
        }
        return query;
    }

    protected String extractJpql() {
        String jpql = jpqlBuffer.toString();
        jpql = jpql.replaceAll("SELECT", " SELECT ");
        jpql = jpql.replaceAll("FROM", " FROM ");
        jpql = jpql.replaceAll("WHERE", " WHERE ");
        jpql = jpql.replaceAll("LEFT", " LEFT ");
        jpql = jpql.replaceAll("INNER", " INNER ");
        jpql = jpql.replaceAll("JOIN", " JOIN ");
        jpql = jpql.replaceAll("AND", " AND ");
        jpql = jpql.replaceAll("ORDER BY", " ORDER BY ");
        jpql = jpql.replaceAll("DISTINCT", " DISTINCT ");
        jpql = jpql.replaceAll("OR(?!DER)", " OR ");
        jpql = jpql.replaceAll("[^OT](IN)(?!(CT.|NER))", " IN ");
        return jpql.replaceAll("\\s{2,}", " ").trim();
    }

    public Query toSearchQuery(EntityManager em) {
        Query query = toQuery(em);
        query.setHint("org.hibernate.cacheable", true);
        return query;
    }

    public boolean isEmpty() {
        return this.jpqlBuffer.length() == 0;
    }

    public QueryBuilder delete(int start, int end) {
        jpqlBuffer.delete(start, end);
        return this;
    }

    public QueryBuilder deleteCharAt(int index) {
        jpqlBuffer.deleteCharAt(index);
        return this;
    }

    public int length() {
        return jpqlBuffer.length();
    }

    public int indexOf(String str) {
        return jpqlBuffer.indexOf(str);
    }

    public QueryBuilder insert(int index, String str) {
        jpqlBuffer.insert(index, str);
        return this;
    }

    protected QueryBuilder append(QueryBuilder qb) {
        jpqlBuffer.append(qb.jpqlBuffer);
        values.putAll(qb.values);
        return this;
    }

    public char charAt(int index) {
        return jpqlBuffer.charAt(index);
    }

    @Override
    public String toString() {
        return extractJpql();
    }

}