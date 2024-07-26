CREATE SCHEMA IF NOT EXISTS entreprise_demo;
CREATE TABLE IF NOT EXISTS entreprise_demo.services (
service_id SERIAL PRIMARY KEY,
label VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS entreprise_demo.employe (
	employe_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	prenom VARCHAR(50) NOT NULL,
	nom VARCHAR(50) NOT NULL,
	"age" INT NOT NULL CHECK("age" > 18 and "age" < 65),
	wage DECIMAL (6,2) DEFAULT 1600,
	service_id INT NOT NULL,
	CONSTRAINT  fk_service_id FOREIGN KEY(service_id)
	REFERENCES entreprise_demo.services(services_id)
);

ALTER TABLE IF EXISTS entreprise_demo.employe
	RENAME TO employes;

ALTER TABLE entreprise_demo.employes
	DROP COLUMN employes;