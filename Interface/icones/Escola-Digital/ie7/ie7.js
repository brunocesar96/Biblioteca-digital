/* To avoid CSS expressions while still supporting IE 7 and IE 6, use this script */
/* The script tag referencing this file must be placed before the ending body tag. */

/* Use conditional comments in order to target IE 7 and older:
	<!--[if lt IE 8]><!-->
	<script src="ie7/ie7.js"></script>
	<!--<![endif]-->
*/

(function() {
	function addIcon(el, entity) {
		var html = el.innerHTML;
		el.innerHTML = '<span style="font-family: \'Escola-Digital\'">' + entity + '</span>' + html;
	}
	var icons = {
		'ic_aluno': '&#xe600;',
		'ic_animacao': '&#xe601;',
		'ic_aplicativo': '&#xe602;',
		'ic_audio': '&#xe603;',
		'ic_baixar': '&#xe604;',
		'ic_buscar': '&#xe605;',
		'ic_check': '&#xe606;',
		'ic_editar': '&#xe607;',
		'ic_exercicio': '&#xe608;',
		'ic_experimento': '&#xe609;',
		'ic_facebook': '&#xe60a;',
		'ic_fechar': '&#xe60b;',
		'ic_hipertexto': '&#xe60c;',
		'ic_home': '&#xe60d;',
		'ic_imagem': '&#xe60e;',
		'ic_lista': '&#xe60f;',
		'ic_lixeira': '&#xe610;',
		'ic_perfil_editar': '&#xe611;',
		'ic_professor': '&#xe612;',
		'ic_sair': '&#xe613;',
		'ic_senha_esquecida': '&#xe614;',
		'ic_senha': '&#xe615;',
		'ic_seta_down': '&#xe616;',
		'ic_seta_giro01': '&#xe617;',
		'ic_seta_giro02': '&#xe618;',
		'ic_seta_left': '&#xe619;',
		'ic_seta_up': '&#xe61a;',
		'ic_simulacao': '&#xe61b;',
		'ic_slide': '&#xe61c;',
		'ic_software_educacional': '&#xe61d;',
		'ic_texto': '&#xe61e;',
		'ic_twitter': '&#xe61f;',
		'ic_upload': '&#xe620;',
		'ic_video': '&#xe621;',
		'0': 0
		},
		els = document.getElementsByTagName('*'),
		i, c, el;
	for (i = 0; ; i += 1) {
		el = els[i];
		if(!el) {
			break;
		}
		c = el.className;
		c = c.match(/ic_[^\s'"]+/);
		if (c && icons[c[0]]) {
			addIcon(el, icons[c[0]]);
		}
	}
}());
