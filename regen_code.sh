#!/usr/bin/env bash

gulp codegen --autorest 3.0.6237 --projects resources,storage,network,compute,appservice,sql --spec-root ../azure-rest-api-specs --autorest-java ../autorest.java/fluentgen

