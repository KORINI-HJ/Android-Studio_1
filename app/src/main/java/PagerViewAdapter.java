import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PagerViewAdapter extends FragmentPagerAdapter {
    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position){

            case 0:
                fragment = new Fragment_Webtoon();
                break;
            case 1:
                fragment = new Fragment_Best();
                break;

        }

        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
