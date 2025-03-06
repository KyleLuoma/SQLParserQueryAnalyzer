WITH TotalTransitions AS (
  SELECT
    COUNT(*) AS total_transitions, col_b
  FROM
    PLPtoPDPTransitions
)

SELECT
  (total_transitions * 100.0) / total_plp_views AS percentage
FROM
  TotalTransitions, TotalPLPViews