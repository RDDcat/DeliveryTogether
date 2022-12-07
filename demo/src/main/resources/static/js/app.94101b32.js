(function(){"use strict";var t={1945:function(t,e,o){var s=o(9242),n=o(3396);function a(t,e,o,s,a,i){const l=(0,n.up)("router-view");return(0,n.wg)(),(0,n.j4)(l)}var i={data(){return{}},methods:{},created(){}},l=o(89);const r=(0,l.Z)(i,[["render",a]]);var c=r,g=o(5431);(0,g.z)("/service-worker.js",{ready(){console.log("App is being served from cache by a service worker.\nFor more details, visit https://goo.gl/AFskqB")},registered(){console.log("Service worker has been registered.")},cached(){console.log("Content has been cached for offline use.")},updatefound(){console.log("New content is downloading.")},updated(){console.log("New content is available; please refresh.")},offline(){console.log("No internet connection found. App is running in offline mode.")},error(t){console.error("Error during service worker registration:",t)}});var d=o(2483),u=o.p+"img/logo.6271f4cb.png",A="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABoAAAAaCAYAAACpSkzOAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAENSURBVHgB7ZXhEYIwDIVzngMwQkZwAxmBDWAUNtANwAkcoWygG8AGugEmZ9AaKxSo/OLdfQeXkjyalgKwakGhEFwxcSBqolVciILYwQwhYRzFf3GGCTNNidsIkw7OSXxNkgkGmkEzBPdaTJlZ1GdUBDDpOPYZtQH5mNXWMomVaSOwdpJ0J64qxqrkivDeeZE8U6m6kKk3yq2xWmLGihmJ1VYsVzWybmADC8luXaPGUmIv9yhXboWx7lmRFUNVowGHOGHKR9rHS3breKFPEE5l32CoWfEGQRhQHcBo8Aiae85xNzLwkIHvFviacC76mKAULuStuiTexiU8f3KuteAzLYYRijyfQ/jTr3yVUw/iSuXjWmpFHgAAAABJRU5ErkJggg==";const p={class:"login_main"},m=(0,n._)("img",{class:"login_logo",src:u,alt:""},null,-1),h=(0,n._)("p",{class:"login_title"},'"시켜요 같이"',-1),w=(0,n._)("div",{class:"login_btn_content"},[(0,n._)("img",{class:"login_chat_img",src:A,alt:"",width:"26",height:"26"}),(0,n.Uk)(" 카카오톡으로 로그인하기 ")],-1),f=[w],v=(0,n._)("br",null,null,-1),_=(0,n._)("br",null,null,-1),U=(0,n._)("br",null,null,-1),k=(0,n._)("br",null,null,-1),B=(0,n._)("a",{href:"https://kauth.kakao.com/oauth/authorize?client_id=71e0a176033c8ff1373036d34e7a32ac&redirect_uri=http://localhost:8080/auth/kakao/callback&response_type=code"}," 카카오 ",-1);function b(t,e,o,s,a,i){return(0,n.wg)(),(0,n.iD)("div",p,[m,h,(0,n._)("button",{class:"login_login_button",onClick:e[0]||(e[0]=(...t)=>i.doLogin&&i.doLogin(...t))},f),v,(0,n._)("button",{onClick:e[1]||(e[1]=(...t)=>i.test1&&i.test1(...t))},"test1"),_,(0,n._)("button",{onClick:e[2]||(e[2]=(...t)=>i.test2&&i.test2(...t))},"test2"),U,(0,n._)("button",{onClick:e[3]||(e[3]=(...t)=>i.test3&&i.test3(...t))},"test3"),k,B])}var E={name:"LoginView",components:{},methods:{doLogin(){this.$store.dispatch("doLogin")},test1(){this.$store.dispatch("test1")},test2(){this.$store.dispatch("test2")},test3(){this.$store.dispatch("test3")}}};const I=(0,l.Z)(E,[["render",b]]);var V=I,T="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABoAAAAZCAYAAAAv3j5gAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAALVSURBVHgBrVZNktJQEO5+CdS40MIbxJ1lOUzYWZY4YeOgG4cTCCdQTwDcQE8wzAl0VqbckCpYuJsMuHA38QSykxpCnt0vPzIQeMGyqyB//frr7vd190PQSPPZY0civkYAGwAtesU/kAAzBOnT1UcpL9zxd2+XHdwFAIhdUnGgmAQE33dH00EhIMexKneWd88k4GnqOf2dS5SeWCx899uPINazKwdhaAOKNj0eQxIprRjAYtFP9XKBms5DC5blIS9SqZHwcW6KD57nz0Ajzfphm8x1E8AAFjeNVTDMA4kVBSn6AewhTccmG9EwD0xkWstS5s3cELV9QVhcz1drJYKvbJVKZ+k3BZSE3U4jKZKqbcJrUYiW2lsiUmw7i0jlFhRrNJG8evrIbj6hNO8Qjoyo/37VNsY0FpzXwB1NHoBGmvXqNW1s5ctocl+ne1Kv/mJdkFFDIIiYxhIuoJgwIytFFJm1yjZhCKqPI/USos/w3yXy1EXAsZm0FRBR6TpPVaUWhLP5vtrLHlAGuR3BNAOiO0dWMUEjEsUnzEsVQnf1gWSwrsKkoD3lW0sPBLKDEu0NAAn9v+9kkLc2KWB2Y0ZArIRWaIQ1+vZzXfnraMp7l+0feaiA3PGkBzoJQ4sYTUSTviBvr2KnCnfpPUQ4/E8N+krIhG3E8zdFlsYVX1ASm8xowQOLaogHWOVlvfpOu5Z6GRegTi9pPRZwIyAMRZcX9cNTAcjsmsnFTW19luwrtyeB7DD1ccWDITdBpM77W/x7Y1WDM7o3pCzZxALPHU9V9NmYmBtGiy4BKxwso0td49wWSQbCkyA0Oum3DEhFYIiGUlCzpDwssmepnDyvvpXL8mUGsjY4cdMrVWQ9uk1ZSMrSozScU10E6f6piE3T4hMSz7Kse1C65qbRWk/99lPQ7TOAXghAzbMtxy7UrVfnOmrzNMiOyHt7pe8FZDzgYuQ60Z3r/gAdZFcszzew0wAAAABJRU5ErkJggg==";const C={class:"mainView_container"},y={class:"mainView_post_content"},x={class:"mainView_post_content_row"},Q=(0,n._)("img",{class:"mainView_floatingButton_button",src:T,alt:""},null,-1),P=[Q];function S(t,e,o,s,a,i){const l=(0,n.up)("navBar"),r=(0,n.up)("locationTag"),c=(0,n.up)("post");return(0,n.wg)(),(0,n.iD)("div",C,[(0,n.Wm)(l),((0,n.wg)(!0),(0,n.iD)(n.HY,null,(0,n.Ko)(t.$store.state.post,((t,e)=>((0,n.wg)(),(0,n.iD)("div",{key:e,class:"mainView_post_container"},[(0,n.Wm)(r,{tag:t.tag},null,8,["tag"]),(0,n._)("div",y,[(0,n._)("div",x,[((0,n.wg)(!0),(0,n.iD)(n.HY,null,(0,n.Ko)(t.posts,((e,o)=>((0,n.wg)(),(0,n.j4)(c,{key:o,post:e,tag:t.tag},null,8,["post","tag"])))),128))])])])))),128)),(0,n._)("div",{class:"mainView_floatingButton_container",onClick:e[0]||(e[0]=(...t)=>i.getFood&&i.getFood(...t))},P)])}var j="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACEAAAAhCAYAAABX5MJvAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAFCSURBVHgB7dZNSsNAGMbxZ9IsXOYI6QViD1BLu2tv4Q3UE1RPIJ5AvIFuxOImYHFdirjuEbITdGZeUzEwhbSZeZORCPlDFpl8/UgyMEBXixKo0XSUzEE0VkpdPL++r8CMjZieHN8CdPp7k0wqOeFCWAgTYNyIDXFGlAHqQpwQhwB1INYIGwAXYoVwAXAglQgOwBUifAFcIMInwBYifANsIOIvAFWQHcRslFwT4Rwe20I+ekE/TVdZMRaYJ2hNMTxHQHQk5cAcC82dnlZXKghjIRBtT87VEZpr84MgPCyWb6l5YP/sGCaX+dE5GurpZb33WQFa0P9F5N/1Bl+f/Z2N9CT/jzIwCsFosVyXTePNbJjckcAZHGv0c3DfRPdjFnWIogMInZaNEtF9s9dUrazGgxhSxsV+oHX2WLFU41zT1aq+AYUxyzVTKLRUAAAAAElFTkSuQmCC",Y="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACIAAAAiCAYAAAA6RwvCAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAALxSURBVHgB7VfNTttAEJ5Zh4hL1bxB3VtVFQi3qirUnEh7gido8gTQJ0jyBC1vAE8AnPANt3Dg1hR66NF5guZWSOKdzjohxLF31wkRaiU+KXJ2d3b22xnPjwEe8Y8CYQZ4nltajJ5sEcAKKyipOf7fAYltRNnyz38GMCWmIlJZW6ry4yNv8yyiIVMLoNdr+he/QpgXkQ9vXpal43zOQSDrhIb/7bJpF7Ngc315Bwm+wD2ACC3qdrdN1jESqawv19n5DZgPQuh1N3RkCrpd79eWtshGgiggwmMU1Bm67R3/XI20i8XiIT9XsxYzLVLxXrgQFU8NSlWYNP3zy0ZyX5n3yan3KYhM4WihblQGuJ+lzA9aIThiAwzg92Wn8povaiMSWwOwCgZEEe7p1mIyKnQ14HxTokJxF2xE2BoeWLAA+NssgW3TqkCVi2xEIC00LYjoqXGdrVJ5+8oDExECLIMFUkQ13ZpyLSJugQVIoqwl4nnl0m3tMGuBOueYlOVUDUIZh6gVJHBlfJzII4t5SIw0wT7XHo+JH7MrOsQ3xAh2yBhtehTgXsAqH1xVMYkz1fE7JFxzrUr5Q4GorSUSBC1FJIQHgERqjY+zXPMVbH4mlbCQ5WQA/X6opoQQpb7juALiiLGmANFzEkRSno3jG8WpZn8IJGu2DmxYcxpaQnwR//wqUQpSeWR4SJix/eDaEat52kCV5v2zy6oE2qas9w7hID2VgUmrcEwcnZz92IYZMOjuCt/HphTJ55NymdVX3RqBjkYTKEOYEbIokwHQy67OQqfgj+PUbhVw87O7ubZ0mFW+TYibq6iorOGqMUr45F+o6pyGuVVMNzoh02pydx6Y+s+Ba7GeaLY1DVEuIgqq/ixGUjXPExHAIUwcwkhhPJJYAkHPcBC+7t350BFAtZOzqyPTObkT8+CbBi2d2wRVgr2bgmgMEyXMhciI0CCiqnzICteXRClXt0eilmqobxbEfh4CMxNJERt7gfN+1T3iv8Jf+48nPtcmNUsAAAAASUVORK5CYII=";const R={class:"navBar_container"};function Z(t,e,o,s,a,i){return(0,n.wg)(),(0,n.iD)("nav",R,[(0,n._)("img",{class:"navBar_home",onClick:e[0]||(e[0]=(...t)=>i.getMain&&i.getMain(...t)),src:j,alt:"home_icon"}),(0,n._)("img",{class:"navBar_user",onClick:e[1]||(e[1]=(...t)=>i.getUser&&i.getUser(...t)),src:Y,alt:"home_icon"})])}var O={methods:{getMain(){this.$store.dispatch("getMain")},getUser(){this.$store.dispatch("getUser")}}};const N=(0,l.Z)(O,[["render",Z],["__scopeId","data-v-702041c6"]]);var W=N,X=o(7139),z="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA8AAAAPCAYAAAA71pVKAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAEuSURBVHgBtVLBTcNAENw7XIA74D5Iifn4SRKQrgRKME4BQAWkA0QDYDqghLzyxXz48MBUgJ+WgBt2jc+WLBP5kezD3r3budkZLdE+Ip0dXyXWhJInpxObzI/ifo8eAiY2Dknjtm1y+lIjsKPAVFXCUmbropRSKWUUUdFvUy3bycRorZPm9JAIlqAem/qGvxmBPqS837yu5B90M+hQ1SAJxKgZuQaF8Czt/Za4mE2zdB6tmolsuojeh/oGNfP4wlA0OetFMRoMwDjtPMCA1CC4NWy5iB5aME+rgCcWXQJkWbu4nsvdD77uss1bnQcd25+T3hRme5FXmsdy7zS5g5L+i+XZ9JynePY1m/UpG0ZjNOObjANqlnrTiEIKqnwIHPQPnFJr3seu2eHab9pO4xdFemM/B0THmQAAAABJRU5ErkJggg==";const D=t=>((0,n.dD)("data-v-3a8ba150"),t=t(),(0,n.Cn)(),t),M={class:"locationTag_container"},F={class:"locationTag_tag"},K=D((()=>(0,n._)("img",{src:z,alt:""},null,-1))),G={class:"locationTag_btn"};function H(t,e,o,s,a,i){return(0,n.wg)(),(0,n.iD)("div",M,[(0,n._)("div",F,[K,(0,n.Uk)((0,X.zw)(o.tag.tagName),1)]),(0,n._)("div",G,[1==o.isUpdate?((0,n.wg)(),(0,n.iD)("img",{key:0,class:"locationTag_deleteBtn",onClick:e[0]||(e[0]=t=>i.deleteTag(o.tag)),src:T,alt:""})):(0,n.kq)("",!0)])])}var J={props:["tag","isUpdate"],methods:{deleteTag(t){this.$store.dispatch("deleteTag",t)}}};const L=(0,l.Z)(J,[["render",H],["__scopeId","data-v-3a8ba150"]]);var q=L;const $=["src"],tt={class:"post_content"},et=(0,n._)("div",{class:"post_timer"},[(0,n._)("div",{class:"post_timer_circle"})],-1),ot={class:"post_food"},st={class:"post_storename"},nt={class:"post_member"};function at(t,e,o,s,a,i){return(0,n.wg)(),(0,n.iD)("div",{class:"post_container",onClick:e[0]||(e[0]=(...t)=>i.getPost&&i.getPost(...t))},[(0,n._)("img",{src:o.post.picture,alt:"",class:"post_food_img",width:"50",height:"90"},null,8,$),(0,n._)("div",tt,[et,(0,n._)("p",ot,(0,X.zw)(i.getTitleHead()),1),(0,n._)("p",st,(0,X.zw)(i.getTitleBody()),1),(0,n._)("div",nt,(0,X.zw)(o.post.count)+"/4 ",1)])])}o(7658);var it={props:["post","tag"],data(){return{}},methods:{getTitleHead(){return this.post.title.split("-")[0]},getTitleBody(){return this.post.title.split("-")[1]},getPost(){this.$router.push({name:"post",params:{tag:this.tag,post_id:this.post.post_id}})}}};const lt=(0,l.Z)(it,[["render",at]]);var rt=lt,ct={name:"MainView",components:{navBar:W,locationTag:q,post:rt},methods:{getFood(){this.$store.dispatch("getFoods")}},created(){console.log("main created()"),this.$store.dispatch("getMain",this.$route.params.tag)}};const gt=(0,l.Z)(ct,[["render",S]]);var dt=gt,ut="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAARCAYAAAA7bUf6AAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAEmSURBVHgBnZK9TsMwEMfvnErQgaoTTKgdQGLgIw9AJU+obOUN8gaUN8nGiPIGMLWZ+AhIjMUsHToUtnbqnjZXX9pEUTokzk9yHF+sn3J/G6AC3etzySNZW2CAlO3m2XHrERBdPZyT9hFM/mbvaCKoR41XIrCzdS14EGUle2HDyQsYArgvlPAf8Ox/KZcQRjsSghdRJOAWbjuXfV6jEHd6mma2eP6n6mORIG0BwRl+KE9Ku7m/ilwuDQPlbD6VEWzhEAeBcvP7rbKCLd3T1uHP5H8+zhaFgYDxBsHvc76IJoIkgzy15KW+OnjSZ24sYOJ2bjoXPQLsVRGkEotQVhWkEkK6qipg4kx0K3aSsM5loR/xTYSS1PgGwjLyAGkEYfjmf4+nYMgaK017Sx7AlloAAAAASUVORK5CYII=";const At={class:"userView_container"},pt={class:"userView_content"},mt={class:"userView_user"},ht=(0,n._)("div",{id:"profile",class:"userView_circle"},null,-1),wt={class:"userView_name"},ft={class:"userView_floatingButton_container"},vt=(0,n._)("img",{src:ut,alt:""},null,-1);function _t(t,e,o,s,a,i){const l=(0,n.up)("navBar"),r=(0,n.up)("locationTag"),c=(0,n.up)("router-link");return(0,n.wg)(),(0,n.iD)("div",At,[(0,n.Wm)(l),(0,n._)("div",pt,[(0,n._)("div",mt,[ht,(0,n._)("div",wt,(0,X.zw)(this.$store.state.user.userDTO.nickname),1)])]),((0,n.wg)(!0),(0,n.iD)(n.HY,null,(0,n.Ko)(this.$store.state.user.tags,((t,e)=>((0,n.wg)(),(0,n.iD)("div",{key:e,class:"userView_tag_container"},[(0,n.Wm)(r,{tag:t},null,8,["tag"])])))),128)),(0,n._)("div",ft,[(0,n.Wm)(c,{class:"userView_floatingButton_button",to:"/userUpdate"},{default:(0,n.w5)((()=>[vt])),_:1})])])}var Ut={name:"UserView",data(){return{profile_image:""}},components:{navBar:W,locationTag:q},methods:{setProfile(){const t=document.getElementById("profile");t.style.backgroundImage=this.$store.state.user.profile_image}},mounted(){this.setProfile()}};const kt=(0,l.Z)(Ut,[["render",_t]]);var Bt=kt;const bt={class:"userView_container"},Et={class:"userView_content"},It={class:"userView_user"},Vt=(0,n._)("div",{id:"profile",class:"userView_circle"},null,-1),Tt={class:"userView_name"},Ct={class:"userUpdate_addTag"},yt=(0,n.uE)('<select class="userUpdate_addBtn" id="addTag"><option value="none">==태그 선택==</option><option value="1기숙사">1기숙사</option><option value="2기숙사">2기숙사</option><option value="E동">E동</option><option value="벙커">벙커</option></select>',1),xt=(0,n._)("img",{class:"userUpdate_addImg",src:T,alt:""},null,-1);function Qt(t,e,o,s,a,i){const l=(0,n.up)("navBar"),r=(0,n.up)("locationTag");return(0,n.wg)(),(0,n.iD)("div",bt,[(0,n.Wm)(l),(0,n._)("div",Et,[(0,n._)("div",It,[Vt,(0,n._)("div",Tt,(0,X.zw)(this.$store.state.user.nickname),1)])]),((0,n.wg)(!0),(0,n.iD)(n.HY,null,(0,n.Ko)(this.$store.state.user.tags,((t,e)=>((0,n.wg)(),(0,n.iD)("div",{key:e,class:"userView_tag_container"},[(0,n.Wm)(r,{tag:t,isUpdate:"1"},null,8,["tag"])])))),128)),(0,n._)("div",Ct,[yt,(0,n._)("div",{class:"userUpdate_add",onClick:e[0]||(e[0]=(...t)=>i.addTag&&i.addTag(...t))},[(0,n.Uk)(" 추가"),xt])]),(0,n._)("button",{class:"userUpdate_addBtn userUpdate_endBtn",onClick:e[1]||(e[1]=(...t)=>i.getUser&&i.getUser(...t))}," 수정 완료 ")])}var Pt={name:"UserView",data(){return{profile_image:""}},components:{navBar:W,locationTag:q},methods:{setProfile(){const t=document.getElementById("profile");t.style.backgroundImage=this.$store.state.user.profile_image},addTag(){const t=document.getElementById("addTag").value;"none"!==t&&this.$store.dispatch("addTag",t)},getUser(){this.$store.dispatch("getUser")}},mounted(){this.setProfile()}};const St=(0,l.Z)(Pt,[["render",Qt]]);var jt=St;const Yt={class:"postview_container"},Rt={class:"postview_info"},Zt={class:"postview_title_container"},Ot={class:"postview_title"},Nt=(0,n._)("hr",null,null,-1),Wt={class:"postview_content"},Xt=["src"],zt={class:"postview_detail_container"},Dt={class:"postview_detail"},Mt={class:"postview_info_url",href:""},Ft={class:"postview_detail"},Kt={class:"postview_member_img_container"};function Gt(t,e,o,s,a,i){const l=(0,n.up)("navBar");return(0,n.wg)(),(0,n.iD)("div",Yt,[(0,n.Wm)(l),(0,n._)("div",Rt,[(0,n._)("div",Zt,[(0,n._)("div",Ot,(0,X.zw)(this.$store.state.post.title),1)]),Nt,(0,n._)("div",Wt,(0,X.zw)(this.$store.state.post.postdescribe),1),(0,n._)("img",{class:"postview_food_img",src:this.$store.state.post.picture,alt:""},null,8,Xt),(0,n._)("div",zt,[(0,n._)("div",Dt,[(0,n.Uk)(" 채팅방 정보 "),(0,n._)("a",Mt,(0,X.zw)(this.$store.state.post.storeUrl),1)]),(0,n._)("div",Ft,[(0,n.Uk)(" 모집 인원 "),(0,n._)("div",Kt,(0,X.zw)(this.$store.state.post.countNum)+"/4 명 ",1)])]),(0,n._)("button",{class:"postview_button",onClick:e[0]||(e[0]=t=>i.postTogether(this.$store.state.post.storeUrl))}," 같이하기 ")])])}var Ht={name:"PostView",components:{navBar:W},data(){return{}},methods:{postTogether(t){this.$store.dispatch("postTogether",t)}},created(){console.log("postView")}};const Jt=(0,l.Z)(Ht,[["render",Gt]]);var Lt=Jt;const qt={class:"addView_container"},$t={class:"addView_content"},te=(0,n._)("br",null,null,-1),ee=(0,n._)("input",{class:"addView_title",type:"text",id:"title",placeholder:"음식-가게이름",required:""},null,-1),oe=(0,n._)("br",null,null,-1),se={class:"addView_tag",id:"tag",name:"tag-select"},ne=["value"],ae=(0,n._)("br",null,null,-1),ie=(0,n._)("br",null,null,-1),le=(0,n._)("input",{class:"addView_desc",type:"text",id:"desc",placeholder:"간단한 설명 부탁드리겠습니다",required:""},null,-1),re=(0,n._)("br",null,null,-1),ce=(0,n._)("br",null,null,-1),ge=["src"],de=(0,n._)("br",null,null,-1),ue=(0,n._)("br",null,null,-1),Ae={class:"addView_tag",id:"time",name:"time-select"},pe=["value"],me=(0,n._)("br",null,null,-1),he=(0,n._)("br",null,null,-1),we=(0,n._)("input",{class:"addView_chat",type:"text",id:"chatting",placeholder:"오픈채팅방 또는 함께해요의 url을 입력해주세요",required:""},null,-1),fe={class:"addView_isFull"};function ve(t,e,o,s,a,i){const l=(0,n.up)("navBar"),r=(0,n.up)("router-link");return(0,n.wg)(),(0,n.iD)("div",qt,[(0,n.Wm)(l),(0,n._)("div",$t,[(0,n.Uk)(" 제목"),te,ee,(0,n.Uk)(" 태그"),oe,(0,n._)("select",se,[((0,n.wg)(!0),(0,n.iD)(n.HY,null,(0,n.Ko)(a.tags,((t,e)=>((0,n.wg)(),(0,n.iD)("option",{key:e,value:t},(0,X.zw)(t),9,ne)))),128))]),ae,(0,n.Uk)(" 설명"),ie,le,re,(0,n.Wm)(r,{class:"addView_add_image",to:"/image"},{default:(0,n.w5)((()=>[(0,n.Uk)("선택된 이미지")])),_:1}),ce,(0,n._)("img",{class:"addView_image",src:this.$route.params.src,alt:""},null,8,ge),de,(0,n.Uk)(" 마감 시간 설정"),ue,(0,n._)("select",Ae,[((0,n.wg)(!0),(0,n.iD)(n.HY,null,(0,n.Ko)(a.times,((t,e)=>((0,n.wg)(),(0,n.iD)("option",{key:e,value:t},(0,X.zw)(t),9,pe)))),128))]),me,(0,n.Uk)(" 함께해요 정보"),he,we,(0,n._)("div",fe,(0,X.zw)(this.message),1),(0,n._)("input",{class:"addView_button",type:"submit",onClick:e[0]||(e[0]=(...t)=>i.addPost&&i.addPost(...t)),value:"추가하기"})])])}var _e={name:"AddView",components:{navBar:W},data(){return{tags:["1기숙사","2기숙사","E동","벙커"],times:["5분","10분","20분","30분"],isFull:0,message:""}},methods:{addPost(){console.log("addPost()");const t=document.getElementById("title").value,e=document.getElementById("tag").value,o=document.getElementById("desc").value,s=this.$route.params.src,n=document.getElementById("chatting").value,a=document.getElementById("time").value,i=JSON.stringify({title:t,tag:e,postdescribe:o,picture:s,storeUrl:n,limitMinute:a});if(""!==t&&""!==e&&""!==o&&""!==s&&""!==a&&""!==n){if(2!==t.split("-").length)return void(this.message='제목을 "음식-가게이름"으로 작성해주세요.');this.isFull=1,this.$store.dispatch("addPost",i)}else console.log("모든 칸을 다 채워주세요"),this.message="모든 칸을 다 채워주세요"}}};const Ue=(0,l.Z)(_e,[["render",ve]]);var ke=Ue;const Be={class:"imageView_container"},be=(0,n._)("p",{class:"imageView_desc"},"이미지를 클릭하면 다음으로 넘어갑니다.",-1),Ee={class:"imageView_content"},Ie=["src","onClick"];function Ve(t,e,o,s,a,i){const l=(0,n.up)("navBar");return(0,n.wg)(),(0,n.iD)("div",Be,[(0,n.Wm)(l),be,(0,n._)("div",Ee,[((0,n.wg)(!0),(0,n.iD)(n.HY,null,(0,n.Ko)(this.$store.state.foods_test,((t,e)=>((0,n.wg)(),(0,n.iD)("img",{class:"imageView_image",key:e,src:t,alt:"",onClick:e=>i.nextPage(t)},null,8,Ie)))),128))])])}var Te={name:"ImageView",components:{navBar:W},data(){return{}},methods:{nextPage(t){this.$router.push({name:"add",params:{src:t}})}}};const Ce=(0,l.Z)(Te,[["render",Ve]]);var ye=Ce;const xe=[{path:"/",name:"login",component:V},{path:"/main",name:"main",component:dt},{path:"/user",name:"user",component:Bt},{path:"/userUpdate",name:"userUpdate",component:jt},{path:"/post/:tag/amu",name:"post-amu",component:dt},{path:"/post/post/:id",name:"post",component:Lt},{path:"/add/:src",name:"add",component:ke},{path:"/image",name:"image",component:ye}],Qe=(0,d.p7)({history:(0,d.r5)(),routes:xe});var Pe=Qe,Se=o(65),je=o(4311);const Ye=(0,Se.MT)({state:{loginUser:{},user:{},mainPost:[],post:{},foods_test:[o(1605),o(6333),o(8507),o(3893),o(2292),o(1391),o(9304),o(2209),o(6808),o(8353),o(6782),o(5807),o(6866),o(2712),o(2566),o(7612),o(6862),o(8514),o(4030),o(258),o(7572),o(5536)]},mutations:{setAccessToken(t){t.accessToken="access"},setUser(t,e){console.log("setUser()"),t.user=e},setLoginUser(t,e){console.log("setLoginUser()"),t.loginUser=e},setMainPost(t,e){console.log("setMainPost()"),t.mainPost=e},setPost(t,e){console.log("setPost()"),t.post=e}},actions:{doLogin(t){je.Z.get("http://localhost:8080/auth/").then((e=>{console.log("로그인 시작"),console.log(e.data),console.log(e),t.commit("setLoginUser",e.data)})).catch((t=>{console.log("로그인 실패",t)}))},test1(){je.Z.get("/auth/").then((t=>console.log(t))).catch((t=>console.log(t)))},test2(){je.Z.get("/auth/",{transformRequest:[(t,e)=>(delete e.common["X-Requested-With"],t)]}).then((t=>console.log(t))).catch((t=>console.log(t)))},test3(){je.Z.get("http://localhost:8080/auth/",{transformRequest:[(t,e)=>(delete e.common["X-Requested-With"],t)]}).then((t=>console.log(t))).catch((t=>console.log(t)))},getUser(t){console.log("getUser()"),je.Z.get(`http://localhost:8080/post/user/${this.state.loginUser.userId}`).then((e=>{t.commit("setUser",e.data),Pe.push({name:"user"})})).catch((t=>{console.log("error getUser()"),console.log(t)}))},getMain(t,e){console.log("getMain()"),je.Z.get(`http://localhost:8080/post/${e}`).then((o=>{console.log("게시글 불러오기 성공"),console.log(`http://localhost:8080/post/${e}`),console.log(o.data);let s=[],n=[];for(let t in Object.keys(o.data.metaPostDTOS)){for(let e in o.data.metaPostDTOS[t].postTagSearchDTOS.content)console.log(o.data.metaPostDTOS[t].postTagSearchDTOS.content[e]),n.push(o.data.metaPostDTOS[t].postTagSearchDTOS.content[e]);s.push({tag:o.data.metaPostDTOS[t].tagName,posts:n})}console.log(s),t.commit("setMainPost",s)})).catch((t=>console.log("게시글 불러오기 실패",t)))},getPost(t){console.log("getMain()"),je.Z.get(`http://localhost:8080/post/post/${this.state.post.id}`).then((e=>{console.log("게시글 불러오기 성공"),t.commit("setPost",e.data),Pe.push({name:"post"})})).catch((t=>console.log("게시글 불러오기 실패",t)))},getFoods(){console.log("getFoods()"),Pe.push({name:"image"})},addPost(t,e){console.log("addPost()"),console.log(e),je.Z.post("http://localhost:8080/post/create",e).then((t=>{console.log("게시글 추가 요청"),console.log(t),this.dispatch("getPost")})).catch((t=>console.log("게시글 추가 요청 실패",t))),Pe.push({name:"main"})},postTogether(t,e){console.log("getTogether()"),window.location.href=e},deleteTag(t,e){console.log(e);for(let o in this.state.user.tags)this.state.user.tags[o]===e?(this.state.user.tags=this.state.user.tags.filter((t=>t!==e)),je.Z.get(`http://localhost:8080/post/user/sub/delete/${e.id}`,{transformRequest:[(t,e)=>(delete e.common["X-Requested-With"],t)]}).then((t=>{console.log("태그 삭제 완료"),console.log(t)})).catch((t=>{console.log("태그 삭제 실패"),console.log(t)}))):console.log("없는 태그 삭제 불가")},addTag(t,e){this.state.user.tags.includes(e)?console.log("같은 태그가 존재합니다"):(this.state.user.tags.push(e),je.Z.post(`http://localhost:8080/post/user/sub/add?userId=${this.state.loginUser.userId}&tagName=${e.tagName}`,e).then((t=>{console.log("태그추가 성공"),console.log(t)})).catch((t=>{console.log("태그추가 실패"),console.log(t)})))}}});var Re=Ye;(0,s.ri)(c).use(Re).use(Pe).mount("#app")},1605:function(t,e,o){t.exports=o.p+"img/chicken-big.7b57503d.png"},6333:function(t,e,o){t.exports=o.p+"img/food00.c04141eb.jpg"},8507:function(t,e,o){t.exports=o.p+"img/food01.a7fa4143.jpg"},3893:function(t,e,o){t.exports=o.p+"img/food02.fab138ac.jpg"},2292:function(t,e,o){t.exports=o.p+"img/food03.d5cd591a.jpg"},1391:function(t,e,o){t.exports=o.p+"img/food04.bf8399a4.jpg"},9304:function(t,e,o){t.exports=o.p+"img/food05.dc9a71f9.jpg"},2209:function(t,e,o){t.exports=o.p+"img/food06.d681f576.jpg"},6808:function(t,e,o){t.exports=o.p+"img/food07.8abcd559.jpg"},8353:function(t,e,o){t.exports=o.p+"img/food08.ecd12906.jpg"},6782:function(t,e,o){t.exports=o.p+"img/food09.973ec0ec.jpg"},5807:function(t,e,o){t.exports=o.p+"img/food10.1d70d6f9.jpg"},6866:function(t,e,o){t.exports=o.p+"img/food11.71fb03cc.jpg"},2712:function(t,e,o){t.exports=o.p+"img/food12.3e0516c4.jpg"},2566:function(t,e,o){t.exports=o.p+"img/food13.4c2e5541.jpg"},7612:function(t,e,o){t.exports=o.p+"img/food14.db3f2187.jpg"},6862:function(t,e,o){t.exports=o.p+"img/food15.f5a6556f.jpg"},8514:function(t,e,o){t.exports=o.p+"img/food16.c3b1cf1c.jpg"},4030:function(t,e,o){t.exports=o.p+"img/food17.e157c069.jpg"},258:function(t,e,o){t.exports=o.p+"img/food18.9140d572.jpg"},7572:function(t,e,o){t.exports=o.p+"img/food19.3487c716.jpg"},5536:function(t,e,o){t.exports=o.p+"img/food20.9bf13585.jpg"}},e={};function o(s){var n=e[s];if(void 0!==n)return n.exports;var a=e[s]={exports:{}};return t[s](a,a.exports,o),a.exports}o.m=t,function(){var t=[];o.O=function(e,s,n,a){if(!s){var i=1/0;for(g=0;g<t.length;g++){s=t[g][0],n=t[g][1],a=t[g][2];for(var l=!0,r=0;r<s.length;r++)(!1&a||i>=a)&&Object.keys(o.O).every((function(t){return o.O[t](s[r])}))?s.splice(r--,1):(l=!1,a<i&&(i=a));if(l){t.splice(g--,1);var c=n();void 0!==c&&(e=c)}}return e}a=a||0;for(var g=t.length;g>0&&t[g-1][2]>a;g--)t[g]=t[g-1];t[g]=[s,n,a]}}(),function(){o.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return o.d(e,{a:e}),e}}(),function(){o.d=function(t,e){for(var s in e)o.o(e,s)&&!o.o(t,s)&&Object.defineProperty(t,s,{enumerable:!0,get:e[s]})}}(),function(){o.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(t){if("object"===typeof window)return window}}()}(),function(){o.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)}}(),function(){o.p="/"}(),function(){var t={143:0};o.O.j=function(e){return 0===t[e]};var e=function(e,s){var n,a,i=s[0],l=s[1],r=s[2],c=0;if(i.some((function(e){return 0!==t[e]}))){for(n in l)o.o(l,n)&&(o.m[n]=l[n]);if(r)var g=r(o)}for(e&&e(s);c<i.length;c++)a=i[c],o.o(t,a)&&t[a]&&t[a][0](),t[a]=0;return o.O(g)},s=self["webpackChunkdelivery"]=self["webpackChunkdelivery"]||[];s.forEach(e.bind(null,0)),s.push=e.bind(null,s.push.bind(s))}();var s=o.O(void 0,[998],(function(){return o(1945)}));s=o.O(s)})();
//# sourceMappingURL=app.94101b32.js.map