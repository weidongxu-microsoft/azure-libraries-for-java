#!/usr/bin/env bash

gulp codegen --parallel 1 --autorest 3.0.6246 --projects resources,storage,network,compute,appservice,sql --spec-root ../azure-rest-api-specs --autorest-java ../autorest.java/fluentgen

