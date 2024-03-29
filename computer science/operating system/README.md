# Operating System

- [overview](https://hyelie.tistory.com/entry/OS-Operating-System-Overview)
    - OS의 정의와 구조
    - bootstrapping
- [process](https://hyelie.tistory.com/entry/OS-Process)
    - process의 정의와 구조
    - process state
    - process context switch
- [process scheduling](https://hyelie.tistory.com/entry/OS-Process-Scheduling)
    - FIFO, SJF, RR, MFQ, multi processor MFQ
- [thread, concurrency](https://hyelie.tistory.com/entry/OS-Concurrency-Thread)
    - thread의 정의와 구조
    - thread concurrency
    - thread lifecycle
    - fork join concurrency
    - thread context switch
- [synchronization](https://hyelie.tistory.com/entry/OS-Synchronization-Lock-Condition-Variable-Semaphore)
    - atomic operation
    - race condition
    - lock, condition variable, semaphore
- [synchronization 구현](https://hyelie.tistory.com/entry/OS-Implementing-Synchronization)
    - test-and-set, spin lock
    - queueing lock, condition variable, semaphore
    - communicating sequential process
- [multiprocessor synchronization](https://hyelie.tistory.com/entry/OS-Multiprocessor-Synchronization-Deadlock)
    - cache coherence
    - lock contention
        - ticket lock, MCS lock
- [deadlock](https://hyelie.tistory.com/entry/OS-Multiprocessor-Synchronization-Deadlock)
    - deadlock의 정의, 발생요건
    - starvation
    - deadlock handling
        - banker's algorithm
- [address translation](https://hyelie.tistory.com/entry/OS-Address-Translation)
    - address space
        - free space management
        - internal fragmentation, external fragmentation
    - address translation
        - base and bound, segmentation, paging
        - copy on write, zero on reference, fill on demand
        - paged segmentation, multi level paging, inverted page table
    - virtually addressed cache
- [demand paging, thrashing](https://hyelie.tistory.com/entry/OS-Demand-Paging-Thrashing)
    - demand paging의 정의와 과정
    - replacement policy
        - FIFO, MIN, LRU, LFU, Clock
    - thrashing의 정의와 해결 방법
        - working set
        - page coloring
- [file system, directory](https://hyelie.tistory.com/entry/OS-File-System-Directory)
    - file
        - file의 정의
        - file system의 정의
        - in memoryfile data structure
    - directory
        - tree, acyclic
        - hard link, soft link
- [file system 구현](https://hyelie.tistory.com/entry/OS-File-System-%EA%B5%AC%ED%98%84)
    - inode
    - directory 탐색 과정
    - reliability
        - careful ordering, soft update, logging, RAID
- [storage device](https://hyelie.tistory.com/entry/OS-Storage-Device)
    - disk의 구조와 성능
    - disk scheduling
        - FIFO, SSTF, SCAN, CSACN, R-CSCAN
    - SSD