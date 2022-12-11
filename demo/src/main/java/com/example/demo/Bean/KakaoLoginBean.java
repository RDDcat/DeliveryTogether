package com.example.demo.Bean;

import com.example.demo.Bean.Small.RequestKakaoLoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.RedirectView;

@Component
public class KakaoLoginBean {
    @Autowired
    RequestKakaoLoginBean requestKakaoLoginBean;
    public RedirectView exec(){
        return requestKakaoLoginBean.exec();
    }
}
