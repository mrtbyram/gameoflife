echo $TRAVIS_BRANCH
git clone https://$gituser:$gitpass@github.com/mrtbyram/gameoflife.git mrtbyram/gameoflife/release
cd mrtbyram/gameoflife/release
git merge remotes/origin/dev
git push
echo DEV MERGED TO MASTER
