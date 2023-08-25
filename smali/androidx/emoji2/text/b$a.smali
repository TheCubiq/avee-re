.class public final Landroidx/emoji2/text/b$a;
.super Landroidx/emoji2/text/b$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public volatile b:Landroidx/emoji2/text/c;

.field public volatile c:Landroidx/emoji2/text/e;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/b;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/emoji2/text/b$b;-><init>(Landroidx/emoji2/text/b;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    :try_start_0
    new-instance v0, Landroidx/emoji2/text/b$a$a;

    invoke-direct {v0, p0}, Landroidx/emoji2/text/b$a$a;-><init>(Landroidx/emoji2/text/b$a;)V

    iget-object v1, p0, Landroidx/emoji2/text/b$b;->a:Landroidx/emoji2/text/b;

    iget-object v1, v1, Landroidx/emoji2/text/b;->f:Landroidx/emoji2/text/b$g;

    invoke-interface {v1, v0}, Landroidx/emoji2/text/b$g;->a(Landroidx/emoji2/text/b$h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/emoji2/text/b$b;->a:Landroidx/emoji2/text/b;

    invoke-virtual {v1, v0}, Landroidx/emoji2/text/b;->m(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/CharSequence;IIIZ)Ljava/lang/CharSequence;
    .locals 6

    iget-object v0, p0, Landroidx/emoji2/text/b$a;->b:Landroidx/emoji2/text/c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/emoji2/text/c;->h(Ljava/lang/CharSequence;IIIZ)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/view/inputmethod/EditorInfo;)V
    .locals 3

    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v1, p0, Landroidx/emoji2/text/b$a;->c:Landroidx/emoji2/text/e;

    invoke-virtual {v1}, Landroidx/emoji2/text/e;->e()I

    move-result v1

    const-string v2, "android.support.text.emoji.emojiCompat_metadataVersion"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v0, p0, Landroidx/emoji2/text/b$b;->a:Landroidx/emoji2/text/b;

    iget-boolean v0, v0, Landroidx/emoji2/text/b;->g:Z

    const-string v1, "android.support.text.emoji.emojiCompat_replaceAll"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public d(Landroidx/emoji2/text/e;)V
    .locals 8

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/emoji2/text/b$b;->a:Landroidx/emoji2/text/b;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "metadataRepo cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/emoji2/text/b;->m(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/emoji2/text/b$a;->c:Landroidx/emoji2/text/e;

    new-instance p1, Landroidx/emoji2/text/c;

    iget-object v3, p0, Landroidx/emoji2/text/b$a;->c:Landroidx/emoji2/text/e;

    new-instance v4, Landroidx/emoji2/text/b$i;

    invoke-direct {v4}, Landroidx/emoji2/text/b$i;-><init>()V

    iget-object v0, p0, Landroidx/emoji2/text/b$b;->a:Landroidx/emoji2/text/b;

    invoke-static {v0}, Landroidx/emoji2/text/b;->a(Landroidx/emoji2/text/b;)Landroidx/emoji2/text/b$d;

    move-result-object v5

    iget-object v0, p0, Landroidx/emoji2/text/b$b;->a:Landroidx/emoji2/text/b;

    iget-boolean v6, v0, Landroidx/emoji2/text/b;->h:Z

    iget-object v7, v0, Landroidx/emoji2/text/b;->i:[I

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Landroidx/emoji2/text/c;-><init>(Landroidx/emoji2/text/e;Landroidx/emoji2/text/b$i;Landroidx/emoji2/text/b$d;Z[I)V

    iput-object p1, p0, Landroidx/emoji2/text/b$a;->b:Landroidx/emoji2/text/c;

    iget-object p1, p0, Landroidx/emoji2/text/b$b;->a:Landroidx/emoji2/text/b;

    invoke-virtual {p1}, Landroidx/emoji2/text/b;->n()V

    return-void
.end method
