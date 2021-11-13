select
	d.name
	,d.birth_date
	,d.overview
	,w.work_name
	,wt.work_type_ja
	,w.year_of_release
	,w.position
	,w.memo
from
	t_director d
	inner join t_work w
	on d.director_id = w.director_id
	inner join m_work_type wt
	on w.work_type = wt.work_type
where
	d.director_id = /*[# mb:p="directorId"]*/ 'D0000002' /*[/]*/;
