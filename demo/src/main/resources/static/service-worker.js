if(!self.define){let i,o={};const l=(l,n)=>(l=new URL(l+".js",n).href,o[l]||new Promise((o=>{if("document"in self){const i=document.createElement("script");i.src=l,i.onload=o,document.head.appendChild(i)}else i=l,importScripts(l),o()})).then((()=>{let i=o[l];if(!i)throw new Error(`Module ${l} didn’t register its module`);return i})));self.define=(n,r)=>{const e=i||("document"in self?document.currentScript.src:"")||location.href;if(o[e])return;let u={};const s=i=>l(i,e),f={module:{uri:e},exports:u,require:s};o[e]=Promise.all(n.map((i=>f[i]||s(i)))).then((i=>(r(...i),u)))}}define(["./workbox-db5fc017"],(function(i){"use strict";i.setCacheNameDetails({prefix:"delivery"}),self.addEventListener("message",(i=>{i.data&&"SKIP_WAITING"===i.data.type&&self.skipWaiting()})),i.precacheAndRoute([{url:"/css/app.282706a2.css",revision:null},{url:"/img/chicken-big.7b57503d.png",revision:null},{url:"/img/food00.c04141eb.jpg",revision:null},{url:"/img/food01.a7fa4143.jpg",revision:null},{url:"/img/food02.fab138ac.jpg",revision:null},{url:"/img/food03.d5cd591a.jpg",revision:null},{url:"/img/food04.bf8399a4.jpg",revision:null},{url:"/img/food05.dc9a71f9.jpg",revision:null},{url:"/img/food06.d681f576.jpg",revision:null},{url:"/img/food07.8abcd559.jpg",revision:null},{url:"/img/food08.ecd12906.jpg",revision:null},{url:"/img/food09.973ec0ec.jpg",revision:null},{url:"/img/food10.1d70d6f9.jpg",revision:null},{url:"/img/food11.71fb03cc.jpg",revision:null},{url:"/img/food12.3e0516c4.jpg",revision:null},{url:"/img/food13.4c2e5541.jpg",revision:null},{url:"/img/food14.db3f2187.jpg",revision:null},{url:"/img/food15.f5a6556f.jpg",revision:null},{url:"/img/food16.c3b1cf1c.jpg",revision:null},{url:"/img/food17.e157c069.jpg",revision:null},{url:"/img/food18.9140d572.jpg",revision:null},{url:"/img/food19.3487c716.jpg",revision:null},{url:"/img/food20.9bf13585.jpg",revision:null},{url:"/img/logo.6271f4cb.png",revision:null},{url:"/index.html",revision:"e42bac37d0596ad4af7fd7093b90cfa9"},{url:"/js/app.94101b32.js",revision:null},{url:"/js/chunk-vendors.40999e43.js",revision:null},{url:"/manifest.json",revision:"82202de7af568923c79bcfff3c21bd24"},{url:"/robots.txt",revision:"735ab4f94fbcd57074377afca324c813"}],{})}));
//# sourceMappingURL=service-worker.js.map
