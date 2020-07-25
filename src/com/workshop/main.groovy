#!/usr/bin/groovy
package com.workshop

import com.workshop.Config
import com.workshop.utils
import com.workshop.stages.*


def main(script) {
    // Object initialization
    ansiColor('xterm'){
        stages('Test stage'){
            println "Hello!"
        }
    }
return this