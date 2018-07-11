create table campus(
  idCampus int not null,
  codCampus varchar(45),
  nomeCampus varchar(45),
  primary key (idCampus)
);


create table local(
  idLocal int not null,
  nomeLocal varchar(255),
  codLocal varchar(45),
  codPorta varchar(45),
  localizacaoLocal varchar(255),
  primary key (idLocal)
);

create table ocorrencia(
  idOcorrencia smallint(10),
  Pessoa_idPessoa int(11),
  Local_idLocal int(11),
  inutilizavel int(1),
  desuso int (1),
  localizado int(1),
  itempatrimonio_idItemPatrimonio smallint(10),
  observacao varchar(200),
  tipoOcorrencia int(1),
  primary key (idOcorrencia),
  foreign key (Pessoa_idPessoa) references pessoa(idPessoa),
  foreign key (Local_idLocal) references local(idLocal),
  foreign key (itempatrimonio_idItemPatrimonio) references itempatrimonio(idItemPatrimonio)
);

create table pessoa(
  idPessoa int(11),
  nomePessoa varchar(255),
  email varchar(45),
  codSIAPE varchar(45),
  codPessoa varchar(45),
  cargoPessoa varchar(45),
  instituicaoPessoa varchar(45),
  primary key (idPessoa)
);

create table itempatrimonio(
  idItemPatrimonio smallint(10),
  descricaoItem varchar(255),
  tomboItem varchar(45),
  Local_idLocal int(11),
  Campus_idCampus int(11),
  Pessoa_idPessoa int(11),
  statusItem varchar(100),
  tipoItem int(1),
  primary key (idItemPatrimonio),
  foreign key (Local_idLocal) references local(idLocal),
  foreign key (Campus_idCampus) references campus(idCampus),
  foreign key (Pessoa_idPessoa) references pessoa(idPessoa)
);