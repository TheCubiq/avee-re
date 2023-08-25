.class public final Landroidx/emoji2/text/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/a$d;,
        Landroidx/emoji2/text/a$c;,
        Landroidx/emoji2/text/a$b;,
        Landroidx/emoji2/text/a$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;)Landroidx/emoji2/text/d;
    .locals 2

    new-instance v0, Landroidx/emoji2/text/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/emoji2/text/a$a;-><init>(Landroidx/emoji2/text/a$b;)V

    invoke-virtual {v0, p0}, Landroidx/emoji2/text/a$a;->c(Landroid/content/Context;)Landroidx/emoji2/text/b$c;

    move-result-object p0

    check-cast p0, Landroidx/emoji2/text/d;

    return-object p0
.end method
