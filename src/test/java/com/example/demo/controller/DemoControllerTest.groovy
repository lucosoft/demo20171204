package com.example.demo.controller

import spock.lang.Specification

class DemoControllerTest extends Specification {

    def "test 1"(){
        when: "pasa algo"
        def a = 2

        then:

        a*2 == 4
    }
}
