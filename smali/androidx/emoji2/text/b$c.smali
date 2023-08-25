.class public abstract Landroidx/emoji2/text/b$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field public final a:Landroidx/emoji2/text/b$g;

.field public b:Z

.field public c:Z

.field public d:[I

.field public e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/emoji2/text/b$e;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z

.field public g:I

.field public h:I

.field public i:Landroidx/emoji2/text/b$d;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/b$g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0xff0100

    iput v0, p0, Landroidx/emoji2/text/b$c;->g:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/b$c;->h:I

    new-instance v0, Landroidx/emoji2/text/c$b;

    invoke-direct {v0}, Landroidx/emoji2/text/c$b;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/b$c;->i:Landroidx/emoji2/text/b$d;

    const-string v0, "metadataLoader cannot be null."

    invoke-static {p1, v0}, Lcom/daaw/ty0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Landroidx/emoji2/text/b$c;->a:Landroidx/emoji2/text/b$g;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/emoji2/text/b$g;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/b$c;->a:Landroidx/emoji2/text/b$g;

    return-object v0
.end method

.method public b(I)Landroidx/emoji2/text/b$c;
    .locals 0

    iput p1, p0, Landroidx/emoji2/text/b$c;->h:I

    return-object p0
.end method
