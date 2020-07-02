		-- MODUL 1

-- create tablespace perpustakaan
	datafile  'D:\TugasPraktikum\perpustakaan.dbf'
	size 30M;

create user alfin_06966 identified by 12345
default tablespace perpustakaan
quota 30M on perpustakaan;

grant all privileges to alfin_06966;

create table Anggota
	(
		Kd_anggota int,
		Nama_anggota varchar2(15),
		Alamat varchar2(15),
		Telepon varchar2 (100),
		constraint pk_anggota primary key (Kd_anggota)
	);

create table Buku
	(
		Kd_buku int,
		Nama_buku varchar2(15),
		Pengarang varchar2(15),
		Penerbit varchar2 (100),
		Tarif int,
		constraint pk_buku primary key (Kd_buku)
	);	
create table Peminjam(
	No_pinjam int,
	Kd_anggota int,
	Kd_petugas int,
	tgl_pinjam varchar (100),
	constraint pk_peminjam primary key (No_pinjam),
	
);
create table Petugas
	(
		Kd_petugas int,
		Nama_petugas varchar2(15),
		Telp_petugas int,
		constraint pk_petugas primary key (Kd_petugas)
	);	

create table Dipinjam
	(
		No_pinjam int,
		Kd_buku int,
		
	
	);



alter table add constraint fk_dipinjam_peminjam foreign key (No_pinjam) references Peminjam (No_pinjam)
alter table add constraint fk_peminjam_buku foreign key (Kd_buku) references Buku (Kd_buku)	
alter table add constraint fk_peminjam_anggota foreign key (Kd_anggota) references Anggota (Kd_anggota)
alter table add constraint fk_peminjam_petugas foreign key (Kd_petugas) references Petugas (Kd_petugas)	;

CREATE SEQUENCE kantorperpus
  MINVALUE 1
  MAXVALUE 9999999
  START WITH 1
  INCREMENT BY 1
  CACHE 20;

alter table petugas_ rename column nama_petugas to O6966_namapetugas;

ALTER TABLE petugas_06966
ADD CONSTRAINT mhs_unique_const UNIQUE(nama_petugas);

ALTER TABLE petugas_06966
MODIFY  kd_petugas VARCHAR2(100)



		--MODUL 2

insert into anggota (Kd_anggota, Nama_anggota, Alamat, Telepon )values (06, 'usep', 'jambangan', '87787545');
insert into anggota (Kd_anggota, Nama_anggota, Alamat, Telepon )values (07, 'rudi', 'kemalangan', '67203683');

mulitple
insert all
into anggota (Kd_anggota, Nama_anggota, Alamat, Telepon) values (08, 'didin','lombok','123456789')
into anggota (Kd_anggota, Nama_anggota, Alamat, Telepon) values (09, 'udin','Madura','234567891')
into anggota (Kd_anggota, Nama_anggota, Alamat, Telepon) values (10, 'suaidi','Madura','345678912')
select 1 from dual;

insert into buku (Kd_buku, Nama_buku, Pengarang, Penerbit, Tarif )values (400, 'wkwk', 'yuni','bentangp','56000');
insert into buku (Kd_buku, Nama_buku, Pengarang, Penerbit, Tarif )values (500, 'vinta', 'nita','gm','30000');

insert all
into buku (Kd_buku, Nama_buku, Pengarang, Penerbit, Tarif) values  (600, 'rindu', 'firsa','gramedia','50000')
into buku (Kd_buku, Nama_buku, Pengarang, Penerbit, Tarif) values  (700, 'air', 'atta','gramedia','60000')
into buku (Kd_buku, Nama_buku, Pengarang, Penerbit, Tarif) values  (800, 'bumi', 'andi','mediakita','86000')
select 1 from dual;

insert into petugas (Kd_petugas, O6966_namapetugas, Telp_petugas )values (40, 'goni', '78366547');
insert into petugas (Kd_petugas, O6966_namapetugas, Telp_petugas )values (50, 'nanda', '6374346');

insert all
into petugas (Kd_petugas, O6966_namapetugas, Telp_petugas) values   (60, 'soni', '845745')
into petugas (Kd_petugas, O6966_namapetugas, Telp_petugas) values  (70, 'keceng', '78458')
into petugas (Kd_petugas, O6966_namapetugas, Telp_petugas) values  (80, 'atok', '633407')
select 1 from dual;

insert into peminjam (No_pinjam, Kd_anggota,Kd_petugas, tgl_pinjam)values (5223,02, 10, '3');
insert into peminjam(No_pinjam, Kd_anggota,Kd_petugas, tgl_pinjam )values (0863,02, 10, '4');

insert all
into peminjam (No_pinjam, Kd_anggota,Kd_petugas, tgl_pinjam) values   (5334,01, 20, '30')
into peminjam (No_pinjam, Kd_anggota,Kd_petugas, tgl_pinjam) values  (3422,02, 10, '31')
into peminjam (No_pinjam, Kd_anggota,Kd_petugas, tgl_pinjam) values (7464,01, 20, '13')
select 1 from dual;

insert into dipinjam (No_pinjam, Kd_buku)values (8834,300);
insert into dipinjam (No_pinjam, Kd_buku)values (6834,300);

insert all
into dipinjam (No_pinjam, Kd_buku) values  (1242,100)
into dipinjam (No_pinjam, Kd_buku) values  (2564,200)
into dipinjam (No_pinjam, Kd_buku) values (0642,100)
select 1 from dual;


update anggota set Nama_anggota = 'didin' where Nama_anggota like '%a%'or Nama_anggota like '%o%' and Kd_anggota < 4;


update buku
set Nama_buku = 'senja',
Pengarang ='firsa'
where Kd_buku = 100;

update petugas
set O6966_namapetugas = 'goni',
Telp_petugas ='78366547'
where Kd_petugas = 40;


update buku
set Penerbit = 'mediakita',
Tarif = '22000'
where Kd_buku = 100;


-Query menghapus minimal 3 data
delete from petugas where O6966_namapetugas like '%a%' or O6966_namapetugas like '%u%' and Kd_petugas < 7;


Savepoint x;
Rollback to x;
Commit;


- Penerapan Order by (ascending)
select * from anggota order by Nama_anggota asc;


- Penerapan Order by (descending)
select * from anggota order by Nama_anggota desc;


Penerapan Group by 
select Nama_anggotafrom anggota group by Nama_anggota;


		--MODUL 3

insert into anggota values (13, 'reobet', 'sidoarjo', '2132245');
insert into anggota values (14, 'sudi', 'gresik', '34343434');
insert into anggota values (15, 'penyut', 'jombang', '85565665');
insert into anggota values (16, 'zamroni', 'tarik', '74533');
insert into anggota values (17, 'fabi', 'nganjuk', '44545454');
insert into buku values (632, 'air putih', 'robert','mediakita','34004');
insert into buku values (534, 'dead', 'firsa','gramedia', '12000');
insert into buku values (533, 'kursi', 'yuni','bentang','12000');
insert into buku values (122, 'pilu', 'fir','gramedia', '43000');
insert into buku values (543, 'zona', 'ita','bentang','12000');

insert into petugas values (24, 'joni', '4343434');
insert into petugas values (42, 'ruda','75577' );
insert into petugas values (21, 'mamat','212122');
insert into petugas values (76, 'rudi','756578' );
insert into petugas values (26, 'sueop','121463');

insert into peminjam values (6834,01, 20, '21');
insert into peminjam values (8374,01, 20,'12' );
insert into peminjam values (8834,02,10 '03');
insert into peminjam values (8374,01, 20,'12' );
insert into peminjam values (8834,02,10, '03');

insert into dipinjam values (6834,100);
insert into dipinjam values (8374,100);
insert into dipinjam values (8834,200);
insert into dipinjam values (6834,100);
insert into dipinjam values (8374,100);

-Max dan Min dalam 1 Query
select kd_buku, MAX(tarif) AS mahal, MIN(tarif) AS gak_mahal from buku group by kd_buku;


-Count, 1 klausa dan 2 operator dalam 1 Query
select kd_buku, count (kd_buku) as banyak_buku from buku where kd_buku = 100 group by kd_buku;


-Sum dalam 1 Query
select kd_buku, sum (tarif) as total_harga from buku where kd_buku = 200 group by kd_buku;


-Average pada soal 2C diatas
select avg (tarif) as rata_harga from buku;


a. Max dan Min
SELECT nama_buku, pengarang
FROM buku
WHERE tarif =
(SELECT MAX(tarif)
FROM buku);
SELECT nama_buku, pengarang
FROM buku
WHERE tarif =
(SELECT MIN(tarif)
FROM buku);


b. Count, 1 klausa dan 2 operator
SELECT count(kd_buku) as banyak_buku
FROM buku
where kd_buku = 100;


c. Sum
SELECT sum(tarif) as banyak_harga
FROM buku
where kd_buku = 100;


d. Average
SELECT avg(tarif) as rata_harga
FROM buku


e. Group by
SELECT count(kd_buku) as banyak_buku
FROM buku
group by kd_buku;


f. Select setelah where
SELECT nama_buku, pengarang
FROM buku
WHERE tarif =
(SELECT MIN(tarif)
FROM buku);


g. Minimal 3 nested query
SELECT nama_buku, pengarang
FROM buku
WHERE tarif =
(SELECT MIN(tarif)


		-- MODUL 4

insert into anggota values (13, 'reobet', 'sidoarjo', '2132245');
insert into anggota values (14, 'sudi', 'gresik', '34343434');
insert into anggota values (15, 'penyut', 'jombang', '85565665');
insert into anggota values (16, 'zamroni', 'tarik', '74533');
insert into anggota values (17, 'fabi', 'nganjuk', '44545454');

insert into buku values (632, 'air putih', 'robert','mediakita','34004');
insert into buku values (534, 'dead', 'firsa','gramedia', '12000');
insert into buku values (533, 'kursi', 'yuni','bentang','12000');
insert into buku values (122, 'pilu', 'fir','gramedia', '43000');
insert into buku values (543, 'zona', 'ita','bentang','12000');

insert into petugas values (24, 'joni', '4343434');
insert into petugas values (42, 'ruda','75577' );
insert into petugas values (21, 'mamat','212122');
insert into petugas values (76, 'rudi','756578' );
insert into petugas values (26, 'sueop','121463');

insert into peminjam values (6834,01, 20, '21');
insert into peminjam values (8374,01, 20,'12' );
insert into peminjam values (8834,02,10 '03');
insert into peminjam values (8374,01, 20,'12' );
insert into peminjam values (8834,02,10, '03');

insert into dipinjam values (6834,100);
insert into dipinjam values (8374,100);
insert into dipinjam values (8834,200);
insert into dipinjam values (6834,100);
insert into dipinjam values (8374,100);



A. membuat equi join minimal 2 tabel dengan menerapkan operator dan klausa
select p.tgl_pinjam, a.Nama_anggota
from peminjam p inner join
anggota a
on p.Kd_anggota = a.Kd_anggota
where rownum <=5;


B. membuat left join minimal 3 tabel dengan menerapkan klausa dan subquery
select a.tgl_pinjam, b.Nama_anggota, c.o6966_namapetugas
from peminjam a
left join anggota b
on a.Kd_anggota = b.Kd_anggota
left join petugas c 
on a.kd_petugas = c.kd_petugas;


C.membuat right join dengan agregat
select a.tgl_pinjam, b.Nama_anggota, c.telp_petugas
from peminjam a
right join anggota b
on a.Kd_anggota = b.Kd_anggota
right join petugas c 
on a.kd_petugas = c.kd_petugas
where a.Kd_anggota <=10;


create view Anggota_V as
select Kd_anggota, Nama_anggota, alamat
from anggota;


create view daftar_nama as
select a.tgl_pinjam, b.Nama_anggota, c.o6966_namapetugas
from peminjam a
left join anggota b
on a.Kd_anggota = b.Kd_anggota
left join petugas c 
on a.kd_petugas = c.kd_petugas;


create view Gabungan_Tabel as
select a.tgl_pinjam, b.Nama_anggota, c.telp_petugas
from peminjam a
right join anggota b
on a.Kd_anggota = b.Kd_anggota
right join petugas c 
on a.kd_petugas = c.kd_petugas
where a.Kd_anggota <=10;


select Nama_anggota,o6966_namapetugas
from daftar_nama;


select Nama_anggota, telp_petugas
from Gabungan_Tabel;

































