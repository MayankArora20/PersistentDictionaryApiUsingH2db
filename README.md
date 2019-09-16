# PersistentDictionaryApiUsingH2db
This is same as previous Persistent Dictionary API, the only thing is that it uses in-memory database H2 of spring framework instead of 
mysql.

pros:
h2 is in memory database so we don't need mysql driver/connecters dependencies
helpful in testing

cons:
upon each restart of application, all previous data of database erase
