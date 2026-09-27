public class StringProcessor {

    public String appendIfMissing(String str, String suffix)
    {
        if(str.isEmpty())
        {

        }
        if( str.endsWith(suffix))
        {
            return str;
        }
        return str+suffix;
    }
}
