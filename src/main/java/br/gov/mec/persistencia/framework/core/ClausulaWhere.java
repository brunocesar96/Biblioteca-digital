package br.gov.mec.persistencia.framework.core;

/**
 * Created by brunocesar on 08/02/17.
 */
public class ClausulaWhere {

        private StringBuilder clausula;
        private boolean iniciou = false;


        public ClausulaWhere() {
            this.clausula = new StringBuilder();
        }

        public void add(String s, Object... args) {
            if (iniciou) {
                clausula.append(" AND ");

            } else {
                clausula.append(" WHERE ");
                iniciou = true;
            }

            if(args.length > 0)
                clausula.append(String.format(s, args));
            else
                clausula.append(s);
        }

        @Override
        public String toString() {
            return this.clausula.toString();
        }


}
