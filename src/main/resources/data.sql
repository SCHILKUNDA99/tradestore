insert into trade(trade_id,version,book_id,counterparty_id,maturity_date,created_date,expired) values('T1',1,'CP-1','B1',TO_DATE('20/05/2020', 'DD/MM/YYYY'),sysdate(),true);
insert into trade(trade_id,version,book_id,counterparty_id,maturity_date,created_date,expired) values('T2',2,'CP-2','B1',TO_DATE('20/05/2021', 'DD/MM/YYYY'),sysdate(),false);
insert into trade(trade_id,version,book_id,counterparty_id,maturity_date,created_date,expired) values('T2',1,'CP-1','B1',TO_DATE('20/05/2021', 'DD/MM/YYYY'),sysdate(),false);
insert into trade(trade_id,version,book_id,counterparty_id,maturity_date,created_date,expired) values('T3',3,'CP-3','B2',TO_DATE('20/05/2014', 'DD/MM/YYYY'),sysdate(),true);
