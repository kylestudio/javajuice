![java-juice](javajuice.png)


# 介绍

**想成为优秀的IT工作者？想升值加薪？看这一篇就足够了！！！**

这里梳理了Java的点滴琐碎知识（不包括大学课本里面讲的那些基础），以及常人踩过的各种坑。记录了目前行业内主流必须掌握的各种基础知识。包括Docker，MySQL数据库，消息队列中间件等的详细阐述。

适用人群：热爱编程，对Java有一定基础，想要拓展IT技术，或想要找工作/跳槽的程序员。

本仓库目前分为**四个**部分：

- 第一部分是Java知识的总结与梳理
- 第二部分是一些业内必知基础知识
- 第三部分是leetcode经典题目的解析和具体的代码实现
- 第四部分总结一下常用的数据结构与算法


> 作者Kyle Nie  - - KyleStudio
>
> [Kyle Studio](http://kylestudio.7est.com)工作室是一家科技创新工作室。欢迎有意向的志同道合的朋友加入。
> 官方网站：[http://kylestudio.7est.com](http://kylestudio.7est.com)
> 合作邮箱: kylestudio@hotmail.com



# Java知识的总结与梳理

> 请点传送门阅读

## 第一章 基本概念基础篇（那些年踩进去的坑）

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

## 第二章 基本概念进阶篇

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

## 第三章 并发编程基础篇

1. **[线程的定义和创建](./docs/3.1ThreadConcept.md)**
   - 你能区分线程、进程、协程么？
   - 并发和并行的区别呢？
   - Java中实现多线程的方法？
   
2. **[线程状态转换](./docs/3.2ThreadStatus.md)**
   - 线程都有哪几种状态？
   - 常见的影响线程状态的API都有那些？
   - 能画出转换流程图么？
   
3. **[深入理解Java内存模型（重要）](./docs/3.3JavaMM.md)**
   - 内存模型的相关概念
   - 并发编程三要素
   - Java内存模型
   - Happens-before原则
   
4. **[深入剖析volatile关键字](./docs/3.4Volatile.md)**
   - 你了解volatile关键字么？
   - volatile保证原子性/有序性吗？
   - 使用volatile关键字的场景？

## 第四章 并发编程进阶篇

1. **[进程/线程调度算法](./docs/4.1ThreadSchedule.md)**
   - 常见的进程调度算法有那些？
   - 线程调度算法呢？
   - Java是哪种线程调度算法？

2. **[线程锁](./docs/4.2ThreadLock.md)**
   - Java中锁的分类有那些？
   - 写一个死锁的列子并解决它？
   - 可重入锁和不可重入锁的设计？

2. **[Synchronized关键字和CAS](./docs/4.3SynchronizedAndCAS.md)**
   - 多线程的synchronized了解不？新版JDK有什么优化？
   - 高性能的Compare and Swap了解不？
   - CAS有什么问题？

## 第五章 并发编程高级篇

1. **[并发编程核心底层AQS](./docs/5.1AQS.md)**
   - AQS是什么？
   - AQS的核心逻辑？
   - AQS有几种同步方式？
   
2. **[ReentrantLock](./docs/5.2ReentrantLock.md)**
   - ReentrantLock是什么？
   - 看过ReentrantLock源码不？
   - ReentrantLock和synchronized有什么区别？
   - ReentrantReadWriteLock呢？
   
3. **[阻塞/非阻塞队列](./docs/5.3BlockingQueue.md)**
   - 了解阻塞队列BlockingQueue不？
   - 常见的阻塞队列有那些？
   - 非阻塞队列ConcurrentLinkedQueue呢？
   
3. **[线程池](./docs/5.4ThreadPool.md)**
   - 线程池有什么好处？
   - Java里有哪些是常用的线程池？
   - 为什么最好要用ThreadPoolExecutor的方式创建线程池？
   - ThreadPoolExecutor参数？

## 第六章 Java8新特性基础篇

1. **[接口和日期处理](./docs/6.1InterfaceAndDate.md)**
   - Java中接口可以有方法的实现嘛？
   - Java中最新的时间日期处理方法有哪些？
   - 你了解Optional类嘛？
   
2. **[Matespace内存空间和try-with-resources](./docs/6.2Matespace.md)**
   - 了解Matespace内存空间嘛？
   - 什么是try-with-resources？

## 第七章 Java8新特性进阶篇

1. **[函数式编程](./docs/7.1InterfaceCoding.md)**
   - lambda表达式？
   - 常用的函数式编程接口有哪些？
   - 方法引用与构造函数引用？

2. **[集合框架Stream](./docs/7.2Stream.md)**
   - 什么是Stream？
   - Stream里的常用函数有哪些？
   - 集合foreach怎么用？
   
3. **[收集器和集合统计](./docs/7.3Collectors.md)**
   - 什么是Collectors？
   - Collectors里的常用函数有哪些？
   - 集合统计是什么？
   
## 第八章 Java9-13新特性

1. **[JDK9新特性](./docs/8.1JDK9.md)**
   - Jshell
   - 接口私有方法
   - try-with-resource增强
   - 快速创建只读集合
   - Stream新增API
   
2. **[JDK10-11新特性](./docs/8.2JDK11.md)**
   - 局部推断变量var
   - 新增HttpClient
   - java和javac命令优化

3. **[JDK13新特性](./docs/8.3JDK13.md)**
   - 多行文本块
   - 增强switch语句

**未完待续。。**

# 业内必知基础知识

- [Git](memo/Git.md)
- [Linux](memo/Linux.md)
- [Intellij Idea](memo/Idea.md)
- [MySQL基础](memo/MySQL.md)
- [MySQL进阶](memo/MySQLAdv.md)
- [Docker](memo/Docker.md)
- [消息队列基础](memo/MQBasic.md)
- [消息队列进阶](memo/MQAdv.md)
- [JVM基础介绍](docs/JVMBasic.md)
- [JVM GC](docs/JVMGC.md)
- [AWS](docs/aws/AWS.md)

# Leetcode经典题目的解析和代码实现

> 建议先去看题目，自己思考一下，再参考答案。

#### 简单难度

- [E1TwoSums](src/main/java/leetcode/E1TwoSums.java)
- [E20ValidParentheses](src/main/java/leetcode/E20ValidParentheses.java)
- [E21MergeTwoSortedLists](src/main/java/leetcode/E21MergeTwoSortedLists.java)
- [E26RemoveDuplicatesFromSortedArray](src/main/java/leetcode/E26RemoveDuplicatesFromSortedArray.java)
- [E53MaximumSubarray](src/main/java/leetcode/E53MaximumSubarray.java)
- [E88MergeSortedArray](src/main/java/leetcode/E88MergeSortedArray.java)
- [E101SymmetricTree](src/main/java/leetcode/E101SymmetricTree.java)
- [E104MaximumDepthOfBinaryTree](src/main/java/leetcode/E104MaximumDepthOfBinaryTree.java)
- [E108ConvertSortedArrayToBinarySearchTree](src/main/java/leetcode/E108ConvertSortedArrayToBinarySearchTree.java)

#### 中等难度

- [M2AddTwoNumbers](src/main/java/leetcode/M2AddTwoNumbers.java)
- [M3LongestSubstringWithoutRepeatingCharacters](src/main/java/leetcode/M3LongestSubstringWithoutRepeatingCharacters.java)
- [M5LongestPalindromicSubstring](src/main/java/leetcode/M5LongestPalindromicSubstring.java)
- [M11ContainerWithMostWater](src/main/java/leetcode/M11ContainerWithMostWater.java)
- [M15ThreeSum](src/main/java/leetcode/M15ThreeSum.java)
- [M17LetterCombinationsOfAPhoneNumber](src/main/java/leetcode/M17LetterCombinationsOfAPhoneNumber.java)
- [M19RemoveNthNodeFromEndOfList](src/main/java/leetcode/M19RemoveNthNodeFromEndOfList.java)
- [M22GenerateParentheses](src/main/java/leetcode/M22GenerateParentheses.java)
- [M24SwapNodesInPairs](src/main/java/leetcode/M24SwapNodesInPairs.java)
- [M33SearchInRotatedSortedArray](src/main/java/leetcode/M33SearchInRotatedSortedArray.java)
- [M39CombinationSum](src/main/java/leetcode/M39CombinationSum.java)
- [M46Permutations](src/main/java/leetcode/M46Permutations.java)
- [M1658MinimumOperationsToReduceXToZero](src/main/java/leetcode/M1658MinimumOperationsToReduceXToZero.java)
- [M1658MinimumOperationsToReduceXToZero2](src/main/java/leetcode/M1658MinimumOperationsToReduceXToZero2.java)

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

