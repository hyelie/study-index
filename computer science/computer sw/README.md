# Computer Software

- [bit를 이용한 컴퓨터의 정보 표현](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Bit%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%9C-%EC%BB%B4%ED%93%A8%ED%84%B0%EC%9D%98-%EC%A0%95%EB%B3%B4-%ED%91%9C%ED%98%84)
    - integer 연산
        - unsigned, signed의 사칙연산
    - floating point
- [byte ordering](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Byte-Ordering)
    - little endian, big endian
- [calling convention](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Calling-Convention)
- [array, structure, union의 할당과 접근](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Array%EC%99%80-Structure%EC%9D%98-%ED%95%A0%EB%8B%B9%EA%B3%BC-%EC%A0%91%EA%B7%BC)
    - pointer array vs array pointer
    - array, structure, union이 memory에 저장되는 방식
        - alignment
- [buffer overflow](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Buffer-Overflow)
    - 정의와 예방법
- [RAM, disk](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Storage-RAM-Disk)
    - SRAM, DRAM
    - disk
        - 구조, 탐색 시간
        - SSD
- [cache, locality](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Cache%EC%99%80-Locality)
    - locality
        - temporal locality, spatial locality
    - cache
        - cache의 개념, 구조, 읽는 방법
        - middle bit가 set index인 이유
- [static linking](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Static-Linking)
    - linking의 정의
    - static linker
        - 하는 일
        - symbol table
        - symbol resolution
    - executable object file
- [exceptional control flow](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Exceptional-Control-Flow)
    - exceptional control flow의 정의
    - exception 종류
- [process](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Exceptional-Control-Flow)
    - process의 정의와 abstraction
    - context switching
    - process control
    - zombie process
    - signal
        - 보내고 받는 방식
    - signal vs exception
- [system level I/O](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-System-Level-IO)
    - UNIX가 file을 표현하는 방식
- [virtual memory](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Virtual-Memory)
    - virtual memory의 정의
    - address space
    - page table
        - multi level page table
    - page fault
    - TLB
    - address translation
    - memory mapping
        - copy on write
- [dynamic memory allocation](https://hyelie.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-SW-Dynamic-Memory-Allocation)
    - dynamic memory allocation의 정의와 필요성
    - internal fragmentation, external fragmentation
    - free list
        - implicit free list, explicit free list, segregated free list
    - garbage collection - mark and sweep