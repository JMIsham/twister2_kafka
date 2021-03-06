licenses(["notice"])

package(default_visibility = ["//visibility:public"])

java_library(
    name = "aws-java-sdk",
    srcs = ["Empty.java"],
    exports = [
        "@com_amazonaws_aws_java_sdk_core//jar",
        "@com_amazonaws_aws_java_sdk_s3//jar",
    ],
    deps = [
        "//third_party/java:joda_time",
        "@com_amazonaws_aws_java_sdk_core//jar",
        "@com_amazonaws_aws_java_sdk_s3//jar",
        "@com_fasterxml_jackson_core_jackson_annotations//jar",
        "@com_fasterxml_jackson_core_jackson_core//jar",
        "@com_fasterxml_jackson_core_jackson_databind//jar",
        "@commons_codec//jar",
        "@commons_logging_commons_logging//jar",
        "@org_apache_httpcomponents_http_client//jar",
        "@org_apache_httpcomponents_http_core//jar",
    ],
)

java_library(
    name = "checkstyle",
    srcs = ["Empty.java"],
    exports = ["@com_puppycrawl_tools_checkstyle//jar"],
    deps = [
        "@antlr_antlr//jar",
        "@com_google_guava_guava//jar",
        "@com_puppycrawl_tools_checkstyle//jar",
        "@commons_beanutils_commons_beanutils//jar",
        "@commons_cli_commons_cli//jar",
        "@commons_collections_commons_collections//jar",
        "@commons_logging_commons_logging//jar",
    ],
)

java_library(
    name = "cli",
    srcs = ["Empty.java"],
    exports = ["@commons_cli_commons_cli//jar"],
    deps = ["@commons_cli_commons_cli//jar"],
)

java_library(
    name = "guava",
    srcs = ["Empty.java"],
    exports = ["@com_google_guava_guava//jar"],
    deps = ["@com_google_guava_guava//jar"],
)

java_library(
    name = "jackson",
    srcs = ["Empty.java"],
    exports = [
        "@com_fasterxml_jackson_core_jackson_annotations//jar",
        "@com_fasterxml_jackson_core_jackson_core//jar",
        "@com_fasterxml_jackson_core_jackson_databind//jar",
    ],
    deps = [
        "@com_fasterxml_jackson_core_jackson_annotations//jar",
        "@com_fasterxml_jackson_core_jackson_core//jar",
        "@com_fasterxml_jackson_core_jackson_databind//jar",
    ],
)

java_library(
    name = "jarjar",
    srcs = ["Empty.java"],
    exports = ["@org_sonatype_plugins_jarjar_maven_plugin//jar"],
    deps = [
        "@org_ow2_asm_asm_all//jar",
        "@org_sonatype_plugins_jarjar_maven_plugin//jar",
    ],
)

java_library(
    name = "logging",
    srcs = ["Empty.java"],
    exports = ["@org_slf4j_slf4j_api//jar"],
    deps = [
        "@org_slf4j_slf4j_api//jar",
        "@org_slf4j_slf4j_jdk14//jar",
    ],
)

java_library(
    name = "kryo",
    srcs = ["Empty.java"],
    exports = ["@com_esotericsoftware_kryo//jar"],
    deps = [
        "@com_esotericsoftware_kryo//jar",
        "@com_esotericsoftware_minlog//jar",
        "@com_esotericsoftware_reflectasm//jar",
        "@org_objenesis_objenesis//jar",
    ],
)

java_library(
    name = "yarn",
    srcs = ["Empty.java"],
    exports = [
        "@javax_inject_javax_inject//jar",
        "@org_apache_commons_commons_lang3//jar",
        "@org_apache_reef_reef_common//jar",
        "@org_apache_reef_reef_runtime_yarn//jar",
        "@org_apache_reef_reef_utils//jar",
        "@org_apache_reef_tang//jar",
        "@org_apache_reef_wake//jar",
    ],
    deps = [
        "@javax_inject_javax_inject//jar",
        "@org_apache_commons_commons_lang3//jar",
        "@org_apache_reef_reef_common//jar",
        "@org_apache_reef_reef_runtime_yarn//jar",
        "@org_apache_reef_reef_utils//jar",
        "@org_apache_reef_tang//jar",
        "@org_apache_reef_wake//jar",
    ],
)

java_library(
    name = "hadoop-core",
    srcs = ["Empty.java"],
    neverlink = 1,
    exports = ["@org_apache_hadoop_hadoop_core//jar"],
    deps = [
        "@org_apache_hadoop_hadoop_core//jar",
    ],
)

java_library(
    name = "powermock",
    srcs = ["Empty.java"],
    exports = [
        "@org_powermock_powermock_api_mockito//jar",
        "@org_powermock_powermock_api_support//jar",
        "@org_powermock_powermock_core//jar",
        "@org_powermock_powermock_module_junit4//jar",
        "@org_powermock_powermock_module_junit4_common//jar",
    ],
    deps = [
        "@org_javassist_javassist//jar",
        "@org_powermock_powermock_api_mockito//jar",
        "@org_powermock_powermock_api_support//jar",
        "@org_powermock_powermock_core//jar",
        "@org_powermock_powermock_module_junit4//jar",
        "@org_powermock_powermock_module_junit4_common//jar",
        "@org_powermock_powermock_reflect//jar",
    ],
)

# This version is needed for dependents that don't want
# protobuf to be included in the generated binary
java_library(
    name = "protobuf-java-neverlink",
    srcs = ["Empty.java"],
    neverlink = 1,
    exports = ["@com_puppycrawl_tools_checkstyle//jar"],
    deps = ["@com_google_protobuf_protobuf_java//jar"],
)

java_library(
    name = "joda_time",
    srcs = ["Empty.java"],
    exports = ["@joda_time_joda_time//jar"],
    deps = ["@joda_time_joda_time//jar"],
)

java_library(
    name = "junit4",
    srcs = ["Empty.java"],
    exports = ["@junit_junit//jar"],
    deps = ["@junit_junit//jar"],
)

java_library(
    name = "mockito",
    srcs = ["Empty.java"],
    exports = ["@org_mockito_mockito_all//jar"],
    deps = ["@org_mockito_mockito_all//jar"],
)
#
#java_library(
#    name = "org_lz4_lz4_java",
#    visibility = ["//visibility:public"],
#    exports = ["@org_lz4_lz4_java//jar"],
#)
#
#java_library(
#    name = "org_slf4j_slf4j_api",
#    visibility = ["//visibility:public"],
#    exports = ["@org_slf4j_slf4j_api//jar"],
#)
#
#java_library(
#    name = "org_xerial_snappy_snappy_java",
#    visibility = ["//visibility:public"],
#    exports = ["@org_xerial_snappy_snappy_java//jar"],
#)
#
#java_library(
#    name = "org_apache_kafka_kafka_clients",
#    srcs = ["Empty.java"],
#    visibility = ["//visibility:public"],
#    exports = ["@org_apache_kafka_kafka_clients//jar"],
#    deps = [
#        ":org_lz4_lz4_java",
#        ":org_slf4j_slf4j_api",
#        ":org_xerial_snappy_snappy_java",
#    ],
#)
