package section2.Solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Printer {
    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
        //인쇄대기열
        Queue<Integer> list = new LinkedList<>();
        //document
        //시간카운트
        int cnt=1;


        for(int i =0; i<bufferSize; i++){
            list.add(0);
        }
        list.poll();
        list.add(documents[0]);
        documents = Arrays.copyOfRange(documents, 1,documents.length);

        while(list.stream().reduce(0,Integer::sum) !=0 || documents.length!=0){//대기열과 document 모두 비워져있을때


            if(documents.length!= 0){ //대기열에 문서가 있는 경우

                int sum = list.stream().reduce(0, Integer::sum) + documents[0];
                if(sum> capacities){//합이 용량보다 큰 경우
                    list.poll();
                    sum = list.stream().reduce(0, Integer::sum) + documents[0];
                    if(sum >capacities){
                        list.add(0);
                        cnt++;
                    }
                    else{
                        //list.poll();
                        list.add(documents[0]);
                        documents = Arrays.copyOfRange(documents, 1, documents.length);
                        cnt++;
                    }
                }
                else{
                    list.poll();
                    list.add(documents[0]);
                    documents = Arrays.copyOfRange(documents, 1,documents.length);
                    cnt++;

                }
            }
            else{  //대기열에 문서가 없는 경우
                list.poll();
                list.add(0);
                cnt++;
            }


        }
        return cnt;
    }
}
