CREATE SCHEMA IF NOT EXISTS exercice03;

SET search_path TO exercice03;

SELECT ville_nom, ville_population_2012 
	FROM villes_france_free 
	ORDER BY ville_population_2012 
	DESC LIMIT 10;

SELECT ville_nom, ville_surface 
	FROM villes_france_free 
	ORDER BY ville_surface 
	LIMIT 50;

SELECT departement_nom 
	FROM departement 
	WHERE departement_code 
	LIKE '97%';

SELECT ville_nom, ville_population_2012, departement_nom 
	FROM villes_france_free 
	JOIN departement ON departement_code = ville_departement 
	ORDER BY ville_population_2012 DESC LIMIT 10;

SELECT departement_nom, departement_code, COUNT(*) AS nb_communes
	FROM villes_france_free
	JOIN departement ON departement_code = ville_departement
	GROUP BY departement_nom, departement_code
	ORDER BY nb_communes DESC;

SELECT departement_nom, departement_code, SUM(ville_surface) AS superficie
	FROM villes_france_free
	JOIN departement ON departement_code = ville_departement
	GROUP BY departement_nom, departement_code
	ORDER BY superficie DESC;

SELECT COUNT(*) AS nb_ville 
	FROM villes_france_free
	WHERE ville_nom_reel
	LIKE 'Saint%';

