function mhcs_project(){var bb='',$=' top: -1000px;',yb='" for "gwt:onLoadErrorFn"',wb='" for "gwt:onPropertyErrorFn"',hb='");',zb='#',$b='.cache.js',Bb='/',Hb='//',Ub='1FD832FD5D03DE4A5FF30A46D1199EA7',Vb='8C54BB9CE720D545D0F496498729F686',Wb='938E4981E5799C8FDC3D23859B52030D',Zb=':',qb='::',kc=':moduleBase',ab='<!doctype html>',cb='<html><head><\/head><body><\/body><\/html>',tb='=',Ab='?',vb='Bad handler "',_='CSS1Compat',fb='Chrome',Xb='D8D07A8B7402A022990E7ADAD06EF0D9',eb='DOMContentLoaded',V='DUMMY',Yb='EC971C6B181D87F560A43B1BE46305F0',jc='Ignoring non-whitelisted Dev Mode URL: ',ic='__gwtDevModeHook:mhcs_project',Gb='base',Eb='baseUrl',Q='begin',W='body',P='bootstrap',Db='clear.cache.gif',sb='content',fc='end',gb='eval("',hc='file:',Pb='gecko',Qb='gecko1_8',R='gwt.codesvr.mhcs_project=',S='gwt.codesvr=',ec='gwt/clean/clean.css',xb='gwt:onLoadErrorFn',ub='gwt:onPropertyErrorFn',rb='gwt:property',mb='head',cc='href',gc='http:',Mb='ie10',Ob='ie8',Nb='ie9',X='iframe',Cb='img',jb='javascript',Y='javascript:""',_b='link',dc='loadExternalRefs',nb='meta',T='mhcs_project',Tb='mhcs_project.devmode.js',Fb='mhcs_project.nocache.js',pb='mhcs_project::',lb='moduleRequested',kb='moduleStartup',Lb='msie',ob='name',Z='position:absolute; width:0; height:0; border:none; left: -1000px;',ac='rel',Kb='safari',ib='script',Sb='selectingPermutation',U='startup',bc='stylesheet',db='undefined',Rb='unknown',Ib='user.agent',Jb='webkit';var o=window;var p=document;r(P,Q);function q(){var a=o.location.search;return a.indexOf(R)!=-1||a.indexOf(S)!=-1}
function r(a,b){if(o.__gwtStatsEvent){o.__gwtStatsEvent({moduleName:T,sessionId:o.__gwtStatsSessionId,subSystem:U,evtGroup:a,millis:(new Date).getTime(),type:b})}}
mhcs_project.__sendStats=r;mhcs_project.__moduleName=T;mhcs_project.__errFn=null;mhcs_project.__moduleBase=V;mhcs_project.__softPermutationId=0;mhcs_project.__computePropValue=null;mhcs_project.__getPropMap=null;mhcs_project.__gwtInstallCode=function(){};mhcs_project.__gwtStartLoadingFragment=function(){return null};var s=function(){return false};var t=function(){return null};__propertyErrorFunction=null;var u=o.__gwt_activeModules=o.__gwt_activeModules||{};u[T]={moduleName:T};var v;function w(){B();return v}
function A(){B();return v.getElementsByTagName(W)[0]}
function B(){if(v){return}var a=p.createElement(X);a.src=Y;a.id=T;a.style.cssText=Z+$;a.tabIndex=-1;p.body.appendChild(a);v=a.contentDocument;if(!v){v=a.contentWindow.document}v.open();var b=document.compatMode==_?ab:bb;v.write(b+cb);v.close()}
function C(k){function l(a){function b(){if(typeof p.readyState==db){return typeof p.body!=db&&p.body!=null}return /loaded|complete/.test(p.readyState)}
var c=b();if(c){a();return}function d(){if(!c){c=true;a();if(p.removeEventListener){p.removeEventListener(eb,d,false)}if(e){clearInterval(e)}}}
if(p.addEventListener){p.addEventListener(eb,d,false)}var e=setInterval(function(){if(b()){d()}},50)}
function m(c){function d(a,b){a.removeChild(b)}
var e=A();var f=w();var g;if(navigator.userAgent.indexOf(fb)>-1&&window.JSON){var h=f.createDocumentFragment();h.appendChild(f.createTextNode(gb));for(var i=0;i<c.length;i++){var j=window.JSON.stringify(c[i]);h.appendChild(f.createTextNode(j.substring(1,j.length-1)))}h.appendChild(f.createTextNode(hb));g=f.createElement(ib);g.language=jb;g.appendChild(h);e.appendChild(g);d(e,g)}else{for(var i=0;i<c.length;i++){g=f.createElement(ib);g.language=jb;g.text=c[i];e.appendChild(g);d(e,g)}}}
mhcs_project.onScriptDownloaded=function(a){l(function(){m(a)})};r(kb,lb);var n=p.createElement(ib);n.src=k;p.getElementsByTagName(mb)[0].appendChild(n)}
mhcs_project.__startLoadingFragment=function(a){return G(a)};mhcs_project.__installRunAsyncCode=function(a){var b=A();var c=w().createElement(ib);c.language=jb;c.text=a;b.appendChild(c);b.removeChild(c)};function D(){var c={};var d;var e;var f=p.getElementsByTagName(nb);for(var g=0,h=f.length;g<h;++g){var i=f[g],j=i.getAttribute(ob),k;if(j){j=j.replace(pb,bb);if(j.indexOf(qb)>=0){continue}if(j==rb){k=i.getAttribute(sb);if(k){var l,m=k.indexOf(tb);if(m>=0){j=k.substring(0,m);l=k.substring(m+1)}else{j=k;l=bb}c[j]=l}}else if(j==ub){k=i.getAttribute(sb);if(k){try{d=eval(k)}catch(a){alert(vb+k+wb)}}}else if(j==xb){k=i.getAttribute(sb);if(k){try{e=eval(k)}catch(a){alert(vb+k+yb)}}}}}t=function(a){var b=c[a];return b==null?null:b};__propertyErrorFunction=d;mhcs_project.__errFn=e}
function F(){function e(a){var b=a.lastIndexOf(zb);if(b==-1){b=a.length}var c=a.indexOf(Ab);if(c==-1){c=a.length}var d=a.lastIndexOf(Bb,Math.min(c,b));return d>=0?a.substring(0,d+1):bb}
function f(a){if(a.match(/^\w+:\/\//)){}else{var b=p.createElement(Cb);b.src=a+Db;a=e(b.src)}return a}
function g(){var a=t(Eb);if(a!=null){return a}return bb}
function h(){var a=p.getElementsByTagName(ib);for(var b=0;b<a.length;++b){if(a[b].src.indexOf(Fb)!=-1){return e(a[b].src)}}return bb}
function i(){var a=p.getElementsByTagName(Gb);if(a.length>0){return a[a.length-1].href}return bb}
function j(){var a=p.location;return a.href==a.protocol+Hb+a.host+a.pathname+a.search+a.hash}
var k=g();if(k==bb){k=h()}if(k==bb){k=i()}if(k==bb&&j()){k=e(p.location.href)}k=f(k);return k}
function G(a){if(a.match(/^\//)){return a}if(a.match(/^[a-zA-Z]+:\/\//)){return a}return mhcs_project.__moduleBase+a}
function H(){var f=[];var g;function h(a,b){var c=f;for(var d=0,e=a.length-1;d<e;++d){c=c[a[d]]||(c[a[d]]=[])}c[a[e]]=b}
var i=[];var j=[];function k(a){var b=j[a](),c=i[a];if(b in c){return b}var d=[];for(var e in c){d[c[e]]=e}if(__propertyErrorFunc){__propertyErrorFunc(a,d,b)}throw null}
j[Ib]=function(){var b=navigator.userAgent.toLowerCase();var c=function(a){return parseInt(a[1])*1000+parseInt(a[2])};if(function(){return b.indexOf(Jb)!=-1}())return Kb;if(function(){return b.indexOf(Lb)!=-1&&p.documentMode>=10}())return Mb;if(function(){return b.indexOf(Lb)!=-1&&p.documentMode>=9}())return Nb;if(function(){return b.indexOf(Lb)!=-1&&p.documentMode>=8}())return Ob;if(function(){return b.indexOf(Pb)!=-1}())return Qb;return Rb};i[Ib]={gecko1_8:0,ie10:1,ie8:2,ie9:3,safari:4};s=function(a,b){return b in i[a]};mhcs_project.__getPropMap=function(){var a={};for(var b in i){if(i.hasOwnProperty(b)){a[b]=k(b)}}return a};mhcs_project.__computePropValue=k;o.__gwt_activeModules[T].bindings=mhcs_project.__getPropMap;r(P,Sb);if(q()){return G(Tb)}var l;try{h([Ob],Ub);h([Mb],Vb);h([Kb],Wb);h([Nb],Xb);h([Qb],Yb);l=f[k(Ib)];var m=l.indexOf(Zb);if(m!=-1){g=parseInt(l.substring(m+1),10);l=l.substring(0,m)}}catch(a){}mhcs_project.__softPermutationId=g;return G(l+$b)}
function I(){if(!o.__gwt_stylesLoaded){o.__gwt_stylesLoaded={}}function c(a){if(!__gwt_stylesLoaded[a]){var b=p.createElement(_b);b.setAttribute(ac,bc);b.setAttribute(cc,G(a));p.getElementsByTagName(mb)[0].appendChild(b);__gwt_stylesLoaded[a]=true}}
r(dc,Q);c(ec);r(dc,fc)}
D();mhcs_project.__moduleBase=F();u[T].moduleBase=mhcs_project.__moduleBase;var J=H();if(o){var K=!!(o.location.protocol==gc||o.location.protocol==hc);o.__gwt_activeModules[T].canRedirect=K;if(K){var L=ic;var M=o.sessionStorage[L];if(!/^http:\/\/(localhost|127\.0\.0\.1)(:\d+)?\/.*$/.test(M)){if(M&&(window.console&&console.log)){console.log(jc+M)}M=bb}if(M&&!o[L]){o[L]=true;o[L+kc]=F();var N=p.createElement(ib);N.src=M;var O=p.getElementsByTagName(mb)[0];O.insertBefore(N,O.firstElementChild||O.children[0]);return false}}}I();r(P,fc);C(J);return true}
mhcs_project.succeeded=mhcs_project();