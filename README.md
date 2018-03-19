# Twister2

This is a  temporary test kafka job for twister2.

Running Kafka job
-------------------

1. install and start kafka server 
2. create a topic with topic name sample_topic1 (run the following command)
      ./bin/kafka-topics.sh --create \
        --replication-factor 1 \
        --partitions 13 \
        --topic sample_topic1 \
        --zookeeper  localhost:2181
    ## List created topics
    ./bin/kafka-topics.sh --list \
        --zookeeper localhost:2181
3. compile and build the twister2 and extract twister2client
4 run the samlple with following command
  ./bin/twister2 submit nodesmpi jar examples/libexamples-java.jar edu.iu.dsc.tws.examples.basic.kafka.KafkaClientJob
  

  
