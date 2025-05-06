
-- V2__add_uuid_to_medicos.sql

-- Adiciona a coluna 'uuid' com valor default usando RANDOM_UUID()
ALTER TABLE medicos
ADD COLUMN uuid VARCHAR(36) NOT NULL DEFAULT RANDOM_UUID();

-- Atualiza registros existentes, atribuindo um UUID único para cada linha
UPDATE medicos
SET uuid = RANDOM_UUID()
WHERE uuid IS NULL;

-- Garante unicidade
ALTER TABLE medicos
ADD CONSTRAINT uk_medicos_uuid UNIQUE (uuid);
