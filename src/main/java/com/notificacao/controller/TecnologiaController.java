package com.notificacao.controller;

import com.notificacao.model.Notificacao;
import com.notificacao.model.Tecnologia;
import com.notificacao.service.NotificacaoService;
import com.notificacao.service.TecnologiaService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Miguel Castro
 */
@Controller
public class TecnologiaController {

    @Autowired
    TecnologiaService tecnologiaService;

    @Autowired
    NotificacaoService noticacaoService;

    @GetMapping("/")
    public ModelAndView listar(ModelMap modelMap) {

        ModelAndView andViewRedirectListar = new ModelAndView("index");
        modelMap.addAttribute("tecs", tecnologiaService.list());
        modelMap.addAttribute("notif", noticacaoService.list());
        int totNotificacao = noticacaoService.list().size();
        modelMap.addAttribute("totNotificacao", totNotificacao);
        return andViewRedirectListar;
    }

    @PostMapping
    public ModelAndView salvar(Tecnologia tecnologia, Notificacao notificacao,
            RedirectAttributes attr, ModelMap modelMap) {

        ModelAndView andViewRedirectListar = new ModelAndView("redirect:/");
        tecnologiaService.save(tecnologia);
        notificacao.setMensagem("Novo curso adicionado para estudos.");
        notificacao.setData(LocalDateTime.now());
        noticacaoService.save(notificacao);
        return andViewRedirectListar;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deletar(@PathVariable("id") Long id) {

        ModelAndView andViewRedirectListar = new ModelAndView("redirect:/");
        noticacaoService.delete(id);
        return andViewRedirectListar;
    }
}
