package mainbenchmark;

import java.util.ArrayList;
import java.util.List;
//import serializable.Benchmark;
//import dataserializable.Benchmark;
//import identifieddataserializable.Benchmark;
//import externalizable.Benchmark;
//import portable.Benchmark;
//import kryo.Benchmark;
//import bytearrayserializer.Benchmark;


/**
 * Created by Esref Ozturk <esrefozturk93@gmail.com> on 23.06.2014.
 */

public class MainBenchmark {

    public static List<Result> results;


    public static void main(String[] args){

        results = new ArrayList<Result>();

        serializable.Benchmark serializableBenchmark = new serializable.Benchmark();
        results.add( new Result( new String("Serializable"),
                        serializableBenchmark.getWritePerformance(),
                        serializableBenchmark.getReadPerformance(),
                        serializableBenchmark.getAverageSize()
                )
        );
        /*
        dataserializable.Benchmark dataserializableBenchmark = new dataserializable.Benchmark();
        results.add( new Result( new String("DataSerializable"),
                        dataserializableBenchmark.getWritePerformance(),
                        dataserializableBenchmark.getReadPerformance(),
                        dataserializableBenchmark.getAverageSize()
                )
        );

        identifieddataserializable.Benchmark identifiedDataSerializableBenchmark = new identifieddataserializable.Benchmark();
        results.add( new Result( new String("IdentifiedDataSerializable:"),
                        identifiedDataSerializableBenchmark.getWritePerformance(),
                        identifiedDataSerializableBenchmark.getReadPerformance(),
                        identifiedDataSerializableBenchmark.getAverageSize()
                )
        );

        externalizable.Benchmark externalizableBenchmark = new externalizable.Benchmark();
        results.add( new Result( new String("Externalizable:"),
                        externalizableBenchmark.getWritePerformance(),
                        externalizableBenchmark.getReadPerformance(),
                        externalizableBenchmark.getAverageSize()
                )
        );

        portable.Benchmark portableBenchmark = new portable.Benchmark();
        results.add( new Result( new String("Portable:"),
                        portableBenchmark.getWritePerformance(),
                        portableBenchmark.getReadPerformance(),
                        portableBenchmark.getAverageSize()
                )
        );

        kryo.Benchmark kryoBenchmark = new kryo.Benchmark();
        results.add( new Result( new String("Kryo"),
                        kryoBenchmark.getWritePerformance(),
                        kryoBenchmark.getReadPerformance(),
                        kryoBenchmark.getAverageSize()
                )
        );

        bytearrayserializer.Benchmark byteArraySerializerBenchmark = new bytearrayserializer.Benchmark();
        results.add( new Result( new String("ByteArraySerializer"),
                        byteArraySerializerBenchmark.getWritePerformance(),
                        byteArraySerializerBenchmark.getReadPerformance(),
                        byteArraySerializerBenchmark.getAverageSize()
                )
        );
*/
        System.out.println("------------------ RESULTS -------------------\n");
        for(int i=0;i<results.size();i++){
            System.out.println( results.get(i).name + ":" );
            System.out.println( "\t\t\t\t\tWrite Performance : " + results.get(i).writePerformance + " ms" );
            System.out.println( "\t\t\t\t\tRead Performance  : " + results.get(i).readPerformance + " ms" );
            System.out.println( "\t\t\t\t\tAverage Size      : " + results.get(i).averageSize + " bytes\n" );

        }


    }
}
