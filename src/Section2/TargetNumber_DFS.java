package Section2;

public class TargetNumber_DFS {
    public int solution(int[] numbers, int target){
        int answer =0;
        Node node = new Node(0);
        answer = node.countValue(node, target);
        return answer;
    }

    class Node{
        private int value;
        private Node rightNode; //+노드
        private Node leftNode; //-노드
        public  Node(){
            value = 0;
        }
        public  Node(int value){
            this.value = value;
            this.rightNode = null;
            this.leftNode = null;
        }
        /*
        * 다음 depth의 노드를 셋팅
        * 현재 노드가 리프노드면 다음 노드를 셋팅
        * */
        public void setNode(Node node, int val){
            if(!node.isTerminal()){
                setNode(node.leftNode, val);
                setNode(node.rightNode, val);
            }
            else{
                node.leftNode = new Node(node.getValue() + val);
                node.rightNode = new Node(node.getValue() - val);

            }
        }

        public int countValue(Node node, int value){
            if(!node.isTerminal()){
                return countValue(node.leftNode, value) + countValue(node.rightNode, value);
            }
            else{
                if(node.getValue() == value) return 1;
            }
            return 0;
        }

        public boolean isTerminal(){
            return this.rightNode == null && this.leftNode ==null ?true: false;
        }

        public int getValue(){
            return this.value;
        }

    }
}
