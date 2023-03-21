import org.antlr.v4.runtime.TokenStreamRewriter;

public class listner1 extends JavaParserBaseListener{
    int i;
    TokenStreamRewriter rewriter;
    public listner1(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;
        this.i=0;
    }
    @Override public void enterBlock(JavaParser.BlockContext ctx) {
        this.i++;
        rewriter.insertAfter(ctx.getStart(),"\n//block number " + this.i);

    }
}
