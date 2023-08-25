.class public Lcom/daaw/b30$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/b30;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:[Lcom/daaw/b30$b;


# direct methods
.method public constructor <init>(I[Lcom/daaw/b30$b;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/b30$a;->a:I

    iput-object p2, p0, Lcom/daaw/b30$a;->b:[Lcom/daaw/b30$b;

    return-void
.end method

.method public static a(I[Lcom/daaw/b30$b;)Lcom/daaw/b30$a;
    .locals 1

    new-instance v0, Lcom/daaw/b30$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/b30$a;-><init>(I[Lcom/daaw/b30$b;)V

    return-object v0
.end method


# virtual methods
.method public b()[Lcom/daaw/b30$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/b30$a;->b:[Lcom/daaw/b30$b;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/daaw/b30$a;->a:I

    return v0
.end method
