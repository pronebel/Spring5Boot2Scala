package com.iqmsoft.scalaspring

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}


@Controller
@EnableAutoConfiguration class SampleScalaController {
  @RequestMapping(Array("/"))
  @ResponseBody private[scalaspring] def home = "Hello World from Spring Boot2 Scala!"
}
