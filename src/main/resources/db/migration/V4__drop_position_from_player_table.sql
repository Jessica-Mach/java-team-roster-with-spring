ALTER TABLE players
DROP COLUMN position,
ADD COLUMN position_id INTEGER NOT NULL REFERENCES positions(id);