package br.gov.mec.controladores;

import br.gov.mec.negocio.Topico;
import br.gov.mec.persistencia.TopicoDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by brunocesar on 08/02/17.
 */


//Configurar páginas de mapeamento mais tarde

@RestController
@Controller
@RequestMapping(value = "/professor/topicos")
public class Topicos {

    @Autowired
    private TopicoDaoImpl topicoDao;

    @RequestMapping(value = "/addTopico" ,method = RequestMethod.POST)
    public ModelAndView addTopico(@ModelAttribute Topico topico){

        ModelAndView modelAndView = new ModelAndView("home");
        topicoDao.add(topico);

        String message = "Topico cadastrado com sucesso!";
        modelAndView.addObject("message", message);

        return  modelAndView;

    }

    //Alterar Topico de acordo com a chave primaria (Nome do Tópico)
    @RequestMapping(value = "/alterarTopico" ,method = RequestMethod.POST)
    public ModelAndView editarTopico(@ModelAttribute Topico topico , @PathVariable String nome){

        ModelAndView modelAndView = new ModelAndView("home");

        topicoDao.update(topico);

        String message = "Topico editado com sucesso!";
        modelAndView.addObject("message", message);

        return modelAndView;

    }

    //Deletar Topico de acordo com a chave primaria (Nome do Tópico)
    @RequestMapping(value = "/deletarTopico" ,method = RequestMethod.GET)
    public  ModelAndView deletarTopico(@PathVariable String nome){

        ModelAndView modelAndView = new ModelAndView("home");
        topicoDao.remove(nome);
        String message = "Topico deletado com sucesso!";
        modelAndView.addObject("message", message);
        return modelAndView;

    }

    //Listagem em ordem alfábetica
    @RequestMapping(value = "/listarTopico" ,method = RequestMethod.GET)
    public ModelAndView listarTopicos(){
        ModelAndView modelAndView = new ModelAndView("listaTopicos");

        List<Topico> topicos = topicoDao.getTopico();
        modelAndView.addObject("topicos", topicos);

        return modelAndView;

    }


}