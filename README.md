## 💻 DeliveryTogether
"끝을 모르고 상승하는 배달비.. 여러명이 같이 시키면 좀 싸지 않을까?" 라는 생각으로 시작한 프로젝트입니다. 

학교 기숙사 앞을 보면 저녁시간때 쯤에 항상 많은 배달기사님들이 학생들을 기다리시며 서성거리시는 것을 볼 수 있는데요.

이를 보며 배달 수령위치가 같은 사람들끼리 자신이 먹고싶은 음식 수요를 공유할 수 있으면 함께 배달을 시키고 좀 더 저렴한 배달료를 지불하게 될수있지 않을까하고 생각했습니다.

배달수령위치를 기준으로 배달글을 올리고, 고객이 음식을 수령할수 있는 위치를 구독해 해당 위치로 올라온 배달글을 볼수 있는 커뮤니티 서비스를 기획했습니다.

배달수령위치는 작게는 제1기숙사, 제2기숙사, 아파트 XXX동등으로 건물 기준으로 생각했습니다.

<br>

+ 지금 보고계시는 프로젝트는 백엔드 프로젝트입니다.

<a href="https://github.com/nulzi/DeliveryTogether">프론트엔드 프로젝트 확인하기</a>


## 창업동아리 발표 자료 (ppt)
해당 프로젝트는 "시켜요 같이"라는 이름으로 교내 창업동아리에 참가한 프로젝트입니다. 
![시켜요 같이(Delivery Together) 발표자료](https://docs.google.com/presentation/d/11OoRDgAtzIqtacS5X96X_J99sTUDrZprmCIyf7hv0gY/edit?usp=sharing)

## 기술 스택
### 프론트
![Vue.js Badge](https://img.shields.io/badge/Vue.js-4FC08D?logo=vuedotjs&logoColor=fff&style=flat)
![JavaScript Badge](https://img.shields.io/badge/JavaScript-F7DF1E?logo=javascript&logoColor=000&style=flat)

### 백엔드
![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white)
![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white)
![MariaDB Badge](https://img.shields.io/badge/MariaDB-003545?logo=mariadb&logoColor=fff&style=flat)


## 구현 내용
### 서비스 화면과 설명
| 화면 | 설명 |
| ------ | ----- |
| <img src="https://github.com/RDDcat/DeliveryTogether/assets/55569476/97afdf05-48d0-40da-bcda-9110797d855e" width=200px> | 스플래시 화면 <br> - 카카오톡 아이디로 로그인 할 수 있습니다. |
| <img src="https://github.com/RDDcat/DeliveryTogether/assets/55569476/0fb00f08-a87e-4930-ab6a-ccf740998f2d" width=200px> | 메인화면 <br> - 태그별 게시글을 확인할 수 있습니다.  - 프로필 화면으로 이동할 수 있습니다. <br> - 새로운 게시글 작성 페이지로 이동할 수 있습니다. <br> - 게시글을 선택할 수 있습니다. <br> - 태그별 게시글은 좌우 드래그로 추가적인 게시글을 확인할 수 있습니다. |
| <img src="https://github.com/RDDcat/DeliveryTogether/assets/55569476/4433fde9-286c-4dc9-b157-642f597fac01" width=200px> | 메인화면(광고 추가버전) <br> - 전체적인 기능은 메인화면과 동일합니다. <br> - 위치 태그에 맞추어 광고를 게시할 수 있습니다. <br> - 해당 위치에 맞게 광고를 특정할 수 있습니다. |
| <img src="https://github.com/RDDcat/DeliveryTogether/assets/55569476/6966f4db-2e5f-4329-8485-610910352856" width=200px> | 게시글 화면 <br> - 게시글 정보를 확인할 수 있습니다. <br> - 게시글 작성자가 제공한 채팅방 링크를 확인할 수 있습니다. <br> - "같이하기" 버튼을 눌러 공동배달에 참여할수 있습니다. |
| <img src="https://github.com/RDDcat/DeliveryTogether/assets/55569476/b6ade545-dd29-4823-8b4a-ce05354906dd" width=200px> | 게시글 작성화면 <br> - 제목, 위치태그 추가, 설명을 작성할 수 있습니다. <br> - 대표이미지를 설정할 수 있습니다. (대표이미지 선택 화면으로 이동) <br> - 마감시간을 설정 할 수 있습니다. <br> - 채팅방 정보를 입력해야합니다. <br> - 추가하기 버튼을 눌러 게시글을 게시할 수 있습니다. |
| <img src="https://github.com/RDDcat/DeliveryTogether/assets/55569476/2058e9ea-115d-40e9-9ed9-30ac0636071f" width=200px> | 게시글 대표이미지 설정 화면 <br> - 제공된 이미지 중 하나를 선택해 게시글의 대표이미지로 설정할 수 있습니다. |
| <img src="https://github.com/RDDcat/DeliveryTogether/assets/55569476/73514145-d78e-4505-8de1-00622cc60f1c" width=200px> | 프로필화면 <br> - 카카오톡 api로 넘어오는 닉네임이 표시됩니다. <br> - 구독한 위치 태그 정보가 표시 됩니다. <br> - 위치 태그를 추가, 수정등의 작업을 할 수 있습니다.|


### 백엔드 기능 정리

+ 메인화면 게시글 가져오기
  + 사용자 아이디로 구독한 위치태그 정보 가져옴
  + 위치태그에 작성되어있는 게시글 메타 정보를 가져옴
+ 특정 게시글 정보 가져오기
  + 게시글 id를 기준으로 게시글 전체 정보를 가져옴
+ 게시글 생성
+ 유저 정보 가져오기
+ 카카오 로그인











