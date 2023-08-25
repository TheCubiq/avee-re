.class public final synthetic Lcom/daaw/zv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroidx/emoji2/text/EmojiCompatInitializer$b;

.field public final synthetic q:Landroidx/emoji2/text/b$h;

.field public final synthetic r:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public synthetic constructor <init>(Landroidx/emoji2/text/EmojiCompatInitializer$b;Landroidx/emoji2/text/b$h;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zv;->p:Landroidx/emoji2/text/EmojiCompatInitializer$b;

    iput-object p2, p0, Lcom/daaw/zv;->q:Landroidx/emoji2/text/b$h;

    iput-object p3, p0, Lcom/daaw/zv;->r:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/zv;->p:Landroidx/emoji2/text/EmojiCompatInitializer$b;

    iget-object v1, p0, Lcom/daaw/zv;->q:Landroidx/emoji2/text/b$h;

    iget-object v2, p0, Lcom/daaw/zv;->r:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-static {v0, v1, v2}, Landroidx/emoji2/text/EmojiCompatInitializer$b;->b(Landroidx/emoji2/text/EmojiCompatInitializer$b;Landroidx/emoji2/text/b$h;Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method
