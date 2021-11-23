# jpa-basic

### JPA
- EntityManagerFactory 는 애플리케이션에 1개만 생성
- EntityManager를 통해서 작업
- 모든 작업은 트랜젝션 안에서 작업

- 롬복 toString 사용하지 말자
- 컨트롤러에서 엔티티 리턴하지 말자
- 컨트롤러에서는 일반적으로 DTO형식으로 반환하자

- 객체설계 단계에서는 단방향으로 완료하자