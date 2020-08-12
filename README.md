![java-juice](javajuice.png)


# 介绍

记录Java的点滴琐碎知识（不包括大学课本里面讲的那些基础），以及常人踩过的各种坑。适用人群：热爱编程，对Java有一定基础，想要拓展Java知识，或想要找工作/跳槽的程序员。

本仓库目前分为**两个**部分：

- 第一部分是Java知识的总结与梳理
- 第二部分是leetcode 经典题目的解析和具体的代码实现
- 第三部分还在计划中，想总结一下常用的数据结构与算法



# Java知识的总结与梳理

> 请点传送门阅读

## 第一章 基础篇（那些年踩进去的坑）

*本篇适用于对Java有一些基础的程序员，着重介绍Java中的各种坑和进阶技巧。*

1. **[运算符、数据类型和常用API了解多少？](./docs/1.1OperatorsTypeApi.md)**
   - 除了+、-、×、/，你还知道Java中其他的运算符嘛？
   - 比如&、&&、|、||、^、<<、>>、>>>？
   - 你了解他们的区别与应用场景嘛？
2. **[你真的了解Java字符串？](./docs/1.2String.md)**
   - 你知道字符串存在哪部分内存中嘛？
   - 字符串拼接又是怎样实现的？
   - 除了+还有什么方法可以拼接字符串？以及效率？
3. **[又爱又恨的OOP](./docs/1.3Oop.md)**
   - 面向对象编程（Object-oriented programming ），还记得它有哪些特性么？
   - Overload和Override的区别是什么？
   - HashCode()？

## 第二章 进阶篇

1. **[对List框架了解多少？](./docs/2.1List.md)**
   - 你知道ArrayList、LinkedList和Vector的区别嘛？
   - 知道如何用ArrayList实现线程安全嘛？
   - 了解ArrayList扩容机制嘛？
2. **[对Map框架了解多少？](./docs/2.2Map.md)**
   - Map和List差不多？那你可能天真了。
   - 你知道HashMap，HashTable，TreeTable的区别嘛？
   - 了解HashMap的底层结构（Entry+LinkedList）嘛？
   - JDK8以后为何用红黑树取代链表结构？
   - 高并发下HashMap是怎么put的？

## 第三章 并发编程技术篇

1. **[线程的定义和创建](./docs/3.1ThreadConcept.md)**
   - 你能区分线程、进程、协程么？
   - 并发和并行的区别呢？
   - Java中实现多线程的方法？
2. **[线程状态转换](./docs/3.2ThreadStatus.md)**
   - 线程都有哪几种状态？
   - 常见的影响线程状态的API都有那些？
   - 能画出转换流程图么？
3. 

**未完待续。。**



# Leetcode经典题目的解析和代码实现

> 建议先去看题目，自己思考一下，再参考答案。


#### 简单难度

- [0001.two-sum](src/main/java/leetcode/E1TwoSums.java)
- [0020.Valid Parentheses](src/main/java/leetcode/E20ValidParentheses.java)
- [0021.MergeTwoSortedLists](src/main/java/leetcode/E21MergeTwoSortedLists.java)
- [0026.remove-duplicates-from-sorted-array](src/main/java/leetcode/E26RemoveDuplicatesFromSortedArray.java)
- [0053.maximum-sum-subarray](src/main/java/leetcode/E53MaximumSubarray.java)
- [0088.merge-sorted-array](src/main/java/leetcode/E88MergeSortedArray.java)
- [0101.symmetric-tree](src/main/java/leetcode/E101SymmetricTree.java)
- [0104.maximum-depth-of-binary-tree](src/main/java/leetcode/E104MaximumDepthOfBinaryTree.java)
- [0108.convert-sorted-array-to-binary-search-tree](src/main/java/leetcode/E108ConvertSortedArrayToBinarySearchTree.java)

**未完待续。。**



# 常用的数据结构与算法

- [DFS和BFS](src/main/java/algorithms/DFSAndBFSAlgorithm.java)

**未完待续。。**



# 感谢

- 小滴课堂: https://xdclass.net/
- 力扣加加: https://leetcode-solution.cn
- Lucifer: https://github.com/azl397985856/leetcode



>  Copyright © 2020 Java Juice. All Rights Reserved. [Kyle Studio](http://kylestudio.7est.com) produced.
>
>  由[KyleStudio工作室](http://kylestudio.7est.com)维护管理 合作邮箱：kylestudio@hotmail.com.

