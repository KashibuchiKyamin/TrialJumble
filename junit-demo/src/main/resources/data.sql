insert into t_director(director_id, name, real_name, birth_date, overview, remarks) values
 ('D0000001', '富野 由悠季', '富野 喜幸', '1941-11-05', '富野 由悠季（とみの よしゆき、1941年11月5日 -）は、日本のアニメ監督・演出家・脚本家・漫画原作者・作詞家・小説家。本人は演出家・原案提供者としている。日本初の30分テレビアニメシリーズ『鉄腕アトム』の制作に携わるなど、日本のテレビアニメ界をその創世期から知る人物。代表作は『機動戦士ガンダム』などのガンダムシリーズ、『伝説巨神イデオン』、または『聖戦士ダンバイン』他のバイストン・ウェル関連作品など。', 'とみの 喜幸、井荻 麟、斧谷 稔、斧谷 喜幸、井草 明夫、阿佐 みなみ、などの別名義がある。')
,('D0000002', '荒木 哲郎' , '' , '1976-11-05', '荒木 哲郎（あらき てつろう、1976年11月5日 - ）は、日本のアニメーター、演出家、アニメーション監督である。『望月三郎』の名義で演出や原画に参加することもある。埼玉県狭山市出身。血液型はB型、星座は蠍座。', '');

insert into t_work (director_id, work_id, work_name, work_type, year_of_release, position, memo) values
 ('D0000001', 'W001', '鉄腕アトム', 'TV', '1963年 - 1966年', '脚本・演出', '')
,('D0000001', 'W002', '海のトリトン', 'TV', '1972年', '監督・脚本', '')
,('D0000001', 'W003', '勇者ライディーン', 'TV', '1975年 - 1976年', 'チーフ・ディレクター', '前半のみ・演出・絵コンテ')
,('D0000001', 'W004', 'しあわせの王子', 'OTHER', '1975年', '演出', '')
,('D0000001', 'W005', 'ラ・セーヌの星', 'TV', '1975年', '監督', '後半のみ')
,('D0000001', 'W006', '無敵超人ザンボット3', 'TV', '1977年 - 1978年', '原作・総監督', '')
,('D0000001', 'W007', '無敵鋼人ダイターン3', 'TV', '1978年 - 1979年', '原作・総監督', '')
,('D0000001', 'W008', '機動戦士ガンダム', 'TV', '1979年 - 1980年', '原作・総監督', '')
,('D0000001', 'W009', '伝説巨神イデオン', 'TV', '1980年 - 1981年', '原作・総監督', '')
,('D0000001', 'W010', '機動戦士ガンダム', 'MOVIE', '1981年', '原作・総監督', '')
,('D0000001', 'W011', '機動戦士ガンダムII 哀・戦士編', 'MOVIE', '1981年', '原作・総監督', '')
,('D0000001', 'W012', '機動戦士ガンダムIII めぐりあい宇宙編', 'MOVIE', '1982年', '原作・総監督', '')
,('D0000001', 'W013', '戦闘メカ ザブングル', 'TV', '1982年 - 1983年', '原作・監督', '')
,('D0000001', 'W014', 'The IDEON(伝説巨神イデオン)接触篇/発動篇', 'MOVIE', '1982年', '原作・総監督', '')
,('D0000001', 'W015', '聖戦士ダンバイン', 'TV', '1983年 - 1984年', '原作・総監督', '')
,('D0000001', 'W016', 'ザブングル グラフィティ', 'MOVIE', '1983年', '原作・監督', '')
,('D0000001', 'W017', '重戦機エルガイム', 'TV', '1984年 - 1985年', '原作・総監督', '')
,('D0000001', 'W018', '機動戦士Ζガンダム', 'TV', '1985年 - 1986年', '原作・総監督', '')
,('D0000001', 'W019', '機動戦士ガンダムΖΖ', 'TV', '1986年 - 1987年', '原作・総監督', '')
,('D0000001', 'W020', '機動戦士ガンダム 逆襲のシャア', 'MOVIE', '1988年', '原案・原作・総監督・脚本', '')
,('D0000001', 'W021', '機動戦士ガンダムF91', 'MOVIE', '1991年', '原作・監督・脚本', '')
,('D0000001', 'W022', '機動戦士Vガンダム', 'TV', '1993年 - 1994年', '原作・総監督', '')
,('D0000001', 'W023', '闇夜の時代劇 第2話「正体を見る」', 'TV', '1995年', '脚本・演出', '')
,('D0000001', 'W024', 'バイストン・ウェル物語 ガーゼィの翼', 'OVA', '1996年', '原作・監督・脚本', '')
,('D0000001', 'W025', 'ブレンパワード', 'TV', '1998年', '原作・総監督', '')
,('D0000001', 'W026', '∀ガンダム', 'TV', '1999年 - 2000年', '原作・総監督', '')
,('D0000001', 'W027', '劇場版 ∀ガンダム I 地球光/II 月光蝶', 'MOVIE', '2002年', '原作・総監督', '')
,('D0000001', 'W028', 'OVERMANキングゲイナー', 'TV', '2002年 - 2003年', '原作・総監督', '')
,('D0000001', 'W029', 'リーンの翼', 'OVA', '2005年 - 2006年', '原作・脚本・絵コンテ・総監督', '')
,('D0000001', 'W030', '機動戦士Ζガンダム 星を継ぐ者', 'MOVIE', '2005年', '原作・脚本・絵コンテ・総監督', '')
,('D0000001', 'W031', '機動戦士ΖガンダムII 恋人たち', 'MOVIE', '2005年', '原作・脚本・絵コンテ・総監督', '')
,('D0000001', 'W032', '機動戦士ΖガンダムIII 星の鼓動は愛', 'MOVIE', '2006年', '原作・脚本・絵コンテ・総監督', '')
,('D0000001', 'W033', 'リング・オブ・ガンダム', 'OTHER', '2009年', '原作・脚本・絵コンテ・総監', '')
,('D0000001', 'W034', 'ガンダム Gのレコンギスタ', 'TV', '2014年 - 2015年', '原作・総監督・脚本・絵コンテ', '最終話・第26話のみ声優(井荻翼名義)としても参加している。')
,('D0000001', 'W035', 'Gのレコンギスタ I 行け！コア・ファイター', 'MOVIE', '2019年', '原作・脚本・総監督', '')
,('D0000001', 'W036', 'Gのレコンギスタ II ベルリ撃進', 'MOVIE', '2020年', '原作・脚本・総監督', '')
,('D0000002', 'W001', '十兵衛ちゃん ラブリー眼帯の秘密', 'TV', '1999年', '制作進行', '')
,('D0000002', 'W002', 'ギャラクシーエンジェル第1期', 'TV', '2001年', '絵コンテ・演出', '')
,('D0000002', 'W003', 'ぱにょぱにょデ・ジ・キャラット', 'TV', '2002年', '絵コンテ・演出', '')
,('D0000002', 'W004', 'ギャラクシーエンジェル第2期', 'TV', '2002年', '絵コンテ・演出', '')
,('D0000002', 'W005', 'ギャラクシーエンジェル第3期', 'TV', '2002年', '絵コンテ・演出', '')
,('D0000002', 'W006', 'デ・ジ・キャラットにょ', 'TV', '2003年', '絵コンテ・演出', '')
,('D0000002', 'W007', ' ガングレイヴ', 'TV', '2003年 - 2004年', '絵コンテ・演出', '')
,('D0000002', 'W008', 'ギャラクシーエンジェル第4期', 'TV', '2004年', '絵コンテ・演出', '')
,('D0000002', 'W009', 'フタコイ オルタナティブ', 'TV', '2005年', '絵コンテ', '※望月三郎名義')
,('D0000002', 'W010', 'BLACK LAGOON', 'TV', '2006年', '絵コンテ・演出', '')
,('D0000002', 'W011', 'シュヴァリエ ～Le Chevalier D''Eon～', 'TV', '2006年', '絵コンテ', '')
,('D0000002', 'W012', 'DEATH NOTE', 'TV', '2006年- 2007年', '監督 絵コンテ・演出・脚本・OP絵コンテ', '')
,('D0000002', 'W013', 'がくえんゆーとぴあ まなびストレート!', 'TV', '2007年', '原画', '')
,('D0000002', 'W014', '逆境無頼カイジ', 'TV', '2008年', '絵コンテ', '')
,('D0000002', 'W015', '黒塚 KUROZUKA', 'TV', '2008年', '監督 絵コンテ・演出・OP絵コンテ', '')
,('D0000002', 'W016', ' ミチコとハッチン', 'TV', '2008年 - 2009年', '絵コンテ・演出※望月三郎名義', '')
,('D0000002', 'W017', '青い文学シリーズ「桜の森の満開の下」', 'TV', '2009年', '監督 絵コンテ・演出', '')
,('D0000002', 'W018', ' とある科学の超電磁砲', 'TV', '2009年 - 2010年', '原画', '')
,('D0000002', 'W019', '学園黙示録 HIGHSCHOOL OF THE DEAD', 'TV', '2010年', '監督 絵コンテ・演出・OP絵コンテ/演出', '')
,('D0000002', 'W020', 'ブレイド', 'TV', '2011年', '絵コンテ', '')
,('D0000002', 'W021', 'ギルティクラウン', 'TV', '2011年', '監督 絵コンテ・演出・OP絵コンテ/演出', '')
,('D0000002', 'W022', 'ソードアート・オンライン', 'TV', '2012年', '絵コンテ', '')
,('D0000002', 'W023', '進撃の巨人', 'TV', '2013年', '監督 絵コンテ・演出・OP絵コンテ', '')
,('D0000002', 'W024', 'ガンダム Gのレコンギスタ', 'TV', '2014年', '絵コンテ・演出', '')
,('D0000002', 'W025', '甲鉄城のカバネリ', 'TV', '2016年', '監督 絵コンテ・演出・OPディレクション・絵コンテ', '')
,('D0000002', 'W026', '進撃の巨人 Season 2', 'TV', '2017年', '総監督 演出・OP絵コンテ・ED演出', '')
,('D0000002', 'W027', '進撃の巨人 Season 3', 'TV', '2018年', '総監督', '')
,('D0000002', 'W028', '富豪刑事 Balance:UNLIMITED', 'TV', '2020年', '絵コンテ', '')
,('D0000002', 'W029', ' 劇場版 カードキャプターさくら 封印されたカード', 'MOVIE', '2000年', '制作進行', '')
,('D0000002', 'W030', ' 時をかける少女', 'MOVIE', '2006年', 'マスコットデザイン', '')
,('D0000002', 'W031', ' 桜の温度', 'MOVIE', '2011年', '原画', '')
,('D0000002', 'W032', ' ねらわれた学園', 'MOVIE', '2012年', '演出', '')
,('D0000002', 'W033', ' 劇場版 進撃の巨人 前編～紅蓮の弓矢～', 'MOVIE', '2014年', '監督', '')
,('D0000002', 'W034', ' 劇場版 進撃の巨人 後編～自由の翼～', 'MOVIE', '2015年', '監督', '')
,('D0000002', 'W035', ' 甲鉄城のカバネリ 総集編 前編 集う光', 'MOVIE', '2016年', '監督', '')
,('D0000002', 'W036', ' 甲鉄城のカバネリ 総集編 後編 燃える命', 'MOVIE', '2017年', '監督', '')
,('D0000002', 'W037', ' 甲鉄城のカバネリ～海門決戦～', 'MOVIE', '2019年', '監督・脚本', '')
,('D0000002', 'W038', ' すてきですわ、さくらちゃん! 知世のカードキャプターさくら 活躍ビデオ日記!', 'OVA', '2000年', '絵コンテ・演出', '')
,('D0000002', 'W039', ' すてきですわ、さくらちゃん! 知世のカードキャプターさくら 活躍ビデオ日記スペシャル!', 'OVA', '2000年', '絵コンテ・演出', '')
,('D0000002', 'W040', ' おとぎ銃士 赤ずきん', 'OVA', '2005年', '監督', '')
,('D0000002', 'W041', ' ゴッドイーター　アニメーションPV', 'GAME', '2010年', '原画', '※望月三郎名義')
,('D0000002', 'W042', '荒木哲郎×平尾隆之 バリウタの愛を知りたい!!', 'COLUMN', '2014年 -', 'その他', '');

insert into m_work_type (work_type, work_type_ja) values
 ('TV', 'テレビアニメ')
,('MOVIE', '劇場版作品')
,('OVA', 'OVA')
,('GAME', 'ゲーム')
,('COLUMN', 'コラム')
,('NOVEL', '小説')
,('OTHER', 'その他');
