SpringBoot Application args :

-Duser.timezone=Asia/Kolkata 
-Dspring.ai.openai.api-key={OPEN_API_KEY}

Docker setup :

* docker compose up -d (Will create the DB)
* docker compose ps (Check if DB is created)
* docker exec -it postgres-student-spring-boot bash ( to create conatiner in DB)
* psql -U "username" ( go inside created username - "premram")
* \l (view all DB)
* Normal sql queries to insert and select data