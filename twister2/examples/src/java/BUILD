package(default_visibility = ["//visibility:public"])

common_deps_files = [
    "@org_yaml_snakeyaml//jar",
    "//twister2/resource-scheduler/src/java:resource-scheduler-java",
    "//twister2/comms/src/java:comms-java",
    "//twister2/common/src/java:common-java",
    "//twister2/task/src/main/java:task-java",
    "//twister2/api/src/java:api-java",
    "//twister2/data/src/main/java:data-java",
    "//twister2/proto:proto_job_java",
    "@com_google_guava_guava//jar",
    "@lmdb_java//jar",
    "@commons_lang_commons_lang//jar",
    "@commons_cli_commons_cli//jar",
    "@org_apache_kafka_kafka_clients//jar",
    "@org_slf4j_slf4j_api//jar",
    "@org_lz4_lz4_java//jar",
    "@org_xerial_snappy_snappy_java//jar",
]

java_library(
    name = "examples-java",
    srcs = glob(["**/*.java"]),
    deps = common_deps_files,
)
