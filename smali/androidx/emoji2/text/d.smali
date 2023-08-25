.class public Landroidx/emoji2/text/d;
.super Landroidx/emoji2/text/b$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/d$a;,
        Landroidx/emoji2/text/d$b;
    }
.end annotation


# static fields
.field public static final j:Landroidx/emoji2/text/d$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/emoji2/text/d$a;

    invoke-direct {v0}, Landroidx/emoji2/text/d$a;-><init>()V

    sput-object v0, Landroidx/emoji2/text/d;->j:Landroidx/emoji2/text/d$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/x20;)V
    .locals 2

    new-instance v0, Landroidx/emoji2/text/d$b;

    sget-object v1, Landroidx/emoji2/text/d;->j:Landroidx/emoji2/text/d$a;

    invoke-direct {v0, p1, p2, v1}, Landroidx/emoji2/text/d$b;-><init>(Landroid/content/Context;Lcom/daaw/x20;Landroidx/emoji2/text/d$a;)V

    invoke-direct {p0, v0}, Landroidx/emoji2/text/b$c;-><init>(Landroidx/emoji2/text/b$g;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/util/concurrent/Executor;)Landroidx/emoji2/text/d;
    .locals 1

    invoke-virtual {p0}, Landroidx/emoji2/text/b$c;->a()Landroidx/emoji2/text/b$g;

    move-result-object v0

    check-cast v0, Landroidx/emoji2/text/d$b;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/d$b;->f(Ljava/util/concurrent/Executor;)V

    return-object p0
.end method
