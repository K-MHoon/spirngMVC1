package hello.servlet.web.frontcontroller.v4;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

/**
 * Model 추가
 */
public interface ControllerV4 {

    String process(Map<String, String> paramMap, Map<String, Object> model);

}

