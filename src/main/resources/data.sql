insert into empleado (id, nombre, apellidos)
 select 1, 'Rocio', 'De La O' from dual where not exists (select 1 from empleado where id = 1);
 
insert into empleado (id, nombre, apellidos)
  select 2, 'Alberto', 'Del Monte' from dual where not exists (select 1 from empleado where id = 2);