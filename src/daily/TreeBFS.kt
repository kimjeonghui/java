package daily

import java.util.ArrayList

import java.util.LinkedList

import java.util.Queue




class TreeBFS {
    fun bfs(node: tree): ArrayList<String>? {
        val answer = ArrayList<String>()
        val queue: Queue<tree> = LinkedList()
        queue.add(node)
        while (queue.size != 0) {
            val current = queue.poll()
            answer.add(current.value)
            if (current.childrenNode != null) queue.addAll(current.childrenNode!!)
        }
        return answer
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    class tree(  //현재 노드의 데이터를 반환
            val value: String) {
        var childrenNode: ArrayList<tree>? = null
            private set

        fun addChildNode(node: tree): tree {
            if (childrenNode == null) childrenNode = ArrayList()
            childrenNode!!.add(node)
            return childrenNode!![childrenNode!!.size - 1]
        }

    }
}