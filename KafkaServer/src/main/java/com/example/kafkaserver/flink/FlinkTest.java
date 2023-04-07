package com.example.kafkaserver.flink;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class FlinkTest {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStream<String> dataStream = env.socketTextStream("localhost", 9999);

//        DataStream<Integer> result = dataStream.flatMap(new FlatMapFunction<String, Integer>() {
//                    @Override
//                    public void flatMap(String value, Collector<Integer> out) throws Exception {
//                        for (String word : value.split(" ")) {
//                            out.collect(word.length());
//                        }
//                    }
//                }).keyBy(new KeySelector<MyObject, String>() {
//                    @Override
//                    public String getKey(MyObject value) throws Exception {
//                        return value.getProperty();
//                    }
//                })
//                .timeWindow(Time.seconds(5))
//                .sum("length");

//        result.print();

        env.execute("MyFlinkJob");
    }
}
