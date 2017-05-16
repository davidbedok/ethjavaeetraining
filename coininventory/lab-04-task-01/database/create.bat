psql -d postgres -h localhost -p 5432 -U postgres -f create-database.sql
psql -d postgres -h localhost -p 5432 -U postgres -f create-role.sql
psql -d postgres -h localhost -p 5432 -U postgres -f create-user.sql

psql -d coininventorydb -h localhost -p 5432 -U postgres -f schema\cointype.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f schema\quality.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f schema\country.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f schema\drawer.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f schema\coin.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f schema\collection.sql

psql -d coininventorydb -h localhost -p 5432 -U postgres -f grant-access.sql

psql -d coininventorydb -h localhost -p 5432 -U postgres -f initial\cointype.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f initial\quality.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f initial\country.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f initial\drawer.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f initial\coin.sql
psql -d coininventorydb -h localhost -p 5432 -U postgres -f initial\collection.sql
