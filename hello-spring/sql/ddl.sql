drop table if exists member CASCADE;
create tabel member {
    id bigint gennerated by default as identity,
    name varchar(255),
    primary key (id)
};