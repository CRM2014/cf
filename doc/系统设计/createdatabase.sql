drop table if exists DataDictionary;

drop table if exists Outflow;

drop table if exists ContactPerson;

drop table if exists ContactRecord;

drop table if exists OrderRecordProduct;

drop table if exists ServiceCustomer;

drop table if exists Development;

drop table if exists SaleChance;

drop table if exists OrderRecord;

drop table if exists Customer;

drop table if exists Service;

drop table if exists User;

drop table if exists Product;

drop table if exists Storage;




/*==============================================================*/
/* Table: ContactPerson                                         */
/*==============================================================*/
create table ContactPerson
(
   copeID               varchar(20) not null,
   cuID                 varchar(20) not null,
   copeName             varchar(20) not null,
   copeSex              varchar(10) not null,
   copePosition         varchar(20) not null,
   copeTel              varchar(20) not null,
   copePhone            varchar(20),
   copeNote             varchar(200),
   primary key (copeID)
);

/*==============================================================*/
/* Table: ContactRecord                                         */
/*==============================================================*/
create table ContactRecord
(
   coreID               varchar(20) not null,
   coID                 varchar(20) not null,
   coreDate             date not null,
   corePlace            varchar(40) not null,
   coreMain             varchar(100) not null,
   coreDescription      varchar(100),
   coreDetail           varchar(200),
   primary key (coreID)
);

/*==============================================================*/
/* Table: Customer                                              */
/*==============================================================*/
create table Customer
(
   cuID                 varchar(20) not null,
   usID                 varchar(20) not null,
   cuName               varchar(20) not null,
   cuZone               varchar(40) not null,
   cuRelation           varchar(20) not null,
   cuLevel              varchar(20) not null,
   cuSatisfy            int not null,
   cuCredit             int not null,
   cuAddress            varchar(60) not null,
   cuPostal             varchar(20) not null,
   cuTel                varchar(20) not null,
   cuFacsimile          varchar(20) not null,
   cuWeb                varchar(20) not null,
   cuLegal              varchar(20) not null,
   cuBank               varchar(20) not null,
   cuBankAccount        varchar(25) not null,
   cuRegisterCapital    float,
   cuTurnover           int not null,
   cuTurnoverNum        varchar(20),
   cuLandTaxNum         varchar(20),
   cuNationTaxNum       varchar(20),
   primary key (cuID)
);

/*==============================================================*/
/* Table: DataDictionary                                        */
/*==============================================================*/
create table DataDictionary
(
   dadiID               varchar(20) not null,
   dadiType             varchar(20) not null,
   dadiItem             varchar(20) not null,
   dadiValue            varchar(20) not null,
   dadiEnableEdit       bool not null,
   primary key (dadiID)
);

/*==============================================================*/
/* Table: Development                                           */
/*==============================================================*/
create table Development
(
   deID                 varchar(20) not null,
   sachID               varchar(20) not null,
   deDate               date not null,
   dePlan               varchar(20) not null,
   deResult             varchar(20),
   deStatus             varchar(20),
   primary key (deID)
);

/*==============================================================*/
/* Table: OrderRecord                                           */
/*==============================================================*/
create table OrderRecord
(
   orreID               varchar(20) not null,
   cuID                 varchar(20) not null,
   orreDate             date not null,
   orrePlace            varchar(40) not null,
   orreStatus           varchar(20) not null,
   primary key (orreID)
);

/*==============================================================*/
/* Table: OrderRecordProduct                                    */
/*==============================================================*/
create table OrderRecordProduct
(
   orreprID             char(10) not null,
   prID                 varchar(20) not null,
   orreID               varchar(20) not null,
   orreprNum            int not null,
   primary key (orreprID)
);

/*==============================================================*/
/* Table: Outflow                                               */
/*==============================================================*/
create table Outflow
(
   ouflID               varchar(20) not null,
   cuID                 varchar(20) not null,
   ouflStatus           varchar(20) not null,
   ouflAction           varchar(200) not null,
   ouflReson            varchar(200),
   ouflTime             datetime,
   primary key (ouflID)
);

/*==============================================================*/
/* Table: Product                                               */
/*==============================================================*/
create table Product
(
   prID                 varchar(20) not null,
   stID                 varchar(20) not null,
   prName               varchar(20) not null,
   prModel              varchar(20) not null,
   prLevel              varchar(20) not null,
   prUnit               varchar(10) not null,
   prPrice              int not null,
   prPosition           varchar(20) not null,
   prNumber             int not null,
   prRemark             varchar(50),
   primary key (prID)
);

/*==============================================================*/
/* Table: SaleChance                                            */
/*==============================================================*/
create table SaleChance
(
   sachID               varchar(20) not null,
   usCreateID           varchar(20) not null,
   usDesignationID      varchar(20),
   usOrigin             varchar(50),
   usProbability        float not null,
   usMain               varchar(50) not null,
   usCustomerName       varchar(20) not null,
   usContanct           varchar(20),
   usContanctTel        varchar(20),
   usChanceDescribe     varchar(100) not null,
   usCreateTime         datetime not null,
   usDesignationTime    datetime,
   primary key (sachID)
);

/*==============================================================*/
/* Table: Service                                               */
/*==============================================================*/
create table Service
(
   seID                 varchar(20) not null,
   prID                 varchar(20) not null,
   usCreateID           varchar(20) not null,
   seType               varchar(20) not null,
   seMain               varchar(20) not null,
   seCreateTime         datetime not null,
   primary key (seID)
);

/*==============================================================*/
/* Table: ServiceCustomer                                       */
/*==============================================================*/
create table ServiceCustomer
(
   secuID               varchar(20) not null,
   cuID                 varchar(20) not null,
   seID                 varchar(20) not null,
   usAllocationID       varchar(20),
   secuAllocationTime   datetime,
   usDealID             varchar(20),
   secuDeal             varchar(200),
   secuDealTime         datetime,
   secuDealResult       varchar(100),
   secuSatisfy          int,
   primary key (secuID)
);

/*==============================================================*/
/* Table: Storage                                               */
/*==============================================================*/
create table Storage
(
   stId                 varchar(20) not null,
   stName               varchar(20) not null,
   primary key (stId)
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   usID                 varchar(20) not null,
   usUserName           varchar(20) not null UNIQUE,
   usPassword           varchar(40) not null,
   usName               varchar(20) not null,
   usRole               varchar(20) not null,
   usLoginTime          datetime,
   usLastLoginTime      datetime,
   usCreateTime         datetime not null,
   primary key (usID)
);

alter table ContactPerson add constraint FK_Reference_4 foreign key (cuID)
      references Customer (cuID) on delete restrict on update restrict;

alter table ContactRecord add constraint FK_Reference_5 foreign key (coID)
      references Customer (cuID) on delete restrict on update restrict;

alter table Customer add constraint FK_Reference_17 foreign key (usID)
      references User (usID) on delete restrict on update restrict;

alter table Development add constraint FK_Reference_15 foreign key (sachID)
      references SaleChance (sachID) on delete restrict on update restrict;

alter table OrderRecord add constraint FK_Reference_1 foreign key (cuID)
      references Customer (cuID) on delete restrict on update restrict;

alter table OrderRecordProduct add constraint FK_Reference_10 foreign key (prID)
      references Product (prID) on delete restrict on update restrict;

alter table OrderRecordProduct add constraint FK_Reference_2 foreign key (orreID)
      references OrderRecord (orreID) on delete restrict on update restrict;

alter table Outflow add constraint FK_Reference_6 foreign key (cuID)
      references Customer (cuID) on delete restrict on update restrict;

alter table Product add constraint FK_Reference_18 foreign key (stID)
      references Storage (stId) on delete restrict on update restrict;

alter table SaleChance add constraint FK_Reference_14 foreign key (usCreateID)
      references User (usID) on delete restrict on update restrict;

alter table SaleChance add constraint FK_Reference_16 foreign key (usDesignationID)
      references User (usID) on delete restrict on update restrict;

alter table Service add constraint FK_Reference_23 foreign key (prID)
      references Product (prID) on delete restrict on update restrict;

alter table Service add constraint FK_Reference_9 foreign key (usCreateID)
      references User (usID) on delete restrict on update restrict;

alter table ServiceCustomer add constraint FK_Reference_19 foreign key (cuID)
      references Customer (cuID) on delete restrict on update restrict;

alter table ServiceCustomer add constraint FK_Reference_20 foreign key (seID)
      references Service (seID) on delete restrict on update restrict;

alter table ServiceCustomer add constraint FK_Reference_21 foreign key (usAllocationID)
      references User (usID) on delete restrict on update restrict;

alter table ServiceCustomer add constraint FK_Reference_22 foreign key (usDealID)
      references User (usID) on delete restrict on update restrict;
