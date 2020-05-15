
-----------------------------------------------------MSSQL------------------------------------------------------
| 1) copy lib\mssql-jdbc-8.2.2.jre[your_jre_version].jar to glassfish5\glassfish\domains\[your_domain]\lib     |
| 2) create db "Journal" and create user(own or you can see persistence.xml config)                            |
| 3) connect to db in NetBeans   (tutorial: https://www.youtube.com/watch?v=IpCgVzv_3QE&t=1503s)               |
| 4) execute sql commands (table.sql, data.sql (in this order))                                                |
| 5) create connection pool in Glassfish Admin Console (JDBC->JDBC Connection Pools) with the                  |
| javax.sql.ServerDataSource resource type and MicrosoftSqlServer vendor                                       |
| 6) edit created pool and set additional properties                                                           |
| User, Password, URL                                                                                          |
| url example: 'jdbc:sqlserver://localhost\DESKTOP-58CFJ1H\SQLEXPRESS:1433;databaseName=Journal'               |
| 7) create connection resource in Glassfish Admin Console (JDBC->JDBC Resource) with your pool name           |
| 8) change persistence.xml if need (jta-data-source is JDBC Resource name)                                    |
----------------------------------------------------------------------------------------------------------------

Роман Красковський
Анна Середа
Іван Золотарьов
Максим Жуков
Дмитро Сурін
