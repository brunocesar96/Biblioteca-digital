package br.gov.mec.controladores;

import br.gov.mec.negocio.Usuario;
import br.gov.mec.persistencia.UsuarioDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by brunocesar on 07/02/17.
 */
@RestController
@Controller
@RequestMapping("/usuario")
public class Usuarios {
    @Autowired
    private UsuarioDaoImpl usuarioDao;

    @RequestMapping(value = "/addUsuario" ,method = RequestMethod.POST)
    public ModelAndView addUsuario(@ModelAttribute Usuario usuario){

        ModelAndView modelAndView = new ModelAndView("home");
        usuarioDao.add(usuario);

        String message = "Usuario cadastrado com sucesso!";
        modelAndView.addObject("message", message);

        return  modelAndView;

    }

    //Alterar Topico de acordo com a chave primaria (Nome do Tópico)
    @RequestMapping(value = "/alterarUsuario" ,method = RequestMethod.POST)
    public ModelAndView editarUsuario(@ModelAttribute Usuario usuario , @PathVariable String nome){

        ModelAndView modelAndView = new ModelAndView("home");

        usuarioDao.update(usuario);

        String message = "Usuario editado com sucesso!";
        modelAndView.addObject("message", message);

        return modelAndView;

    }

    //Deletar Topico de acordo com a chave primaria (Nome do Tópico)
    @RequestMapping(value = "/deletarUsuario" ,method = RequestMethod.GET)
    public  ModelAndView deletarUsuario(@PathVariable String nome){

        ModelAndView modelAndView = new ModelAndView("home");
        usuarioDao.remove(nome);
        String message = "Usuario deletado com sucesso!";
        modelAndView.addObject("message", message);
        return modelAndView;

    }

    //Listagem em ordem alfábetica
    @RequestMapping(value = "/listarUsuario" ,method = RequestMethod.GET)
    public ModelAndView listarUsuario(){
        ModelAndView modelAndView = new ModelAndView("listaUsuarios");

        /*List<Usuario> usuarios = usuarioDao.getUsuario();
        modelAndView.addObject("usuarios", usuarios);*/

        return modelAndView;

    }

}
